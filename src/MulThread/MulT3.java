package MulThread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class MulT3 {
    public static String getTimeNow(){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");

        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }
    public static void play(){
        try{
            System.out.println("时间:"+getTimeNow()+ ","+Thread.currentThread().getName()+":成功申请并发资源");
            Thread.sleep(2000);
            System.out.println("时间:"+getTimeNow()+ ","+Thread.currentThread().getName()+":释放并发资源");
            Thread.sleep(500);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        ExecutorService threadPool= Executors.newCachedThreadPool();
        Semaphore semaphore=new Semaphore(10);
        for(int i=0;i<=20;i++){
            final int index=i;
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try
                    {
                        semaphore.acquire();
                        play();
                        semaphore.release();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                }
            });
        }
        threadPool.shutdown();
    }
}

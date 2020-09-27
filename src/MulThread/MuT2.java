package MulThread;

public class MuT2 extends  Thread{
    private Thread t;
    private String threadName;

    MuT2( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
    public static void main(String args[]) {
        MuT2 T1 = new MuT2( "Thread-1");
        T1.start();

        MuT2 T2 = new MuT2( "Thread-2");
        T2.start();
    }

}

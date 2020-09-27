package MulThread;
import java.util.*;
import java.io.*;
public class MulT1 implements Runnable {

    private Thread t;
    private String threadName;
    MulT1(String name) {
        threadName=name;
        System.out.print("Creating "+threadName);
    }
    public void run() {
        System.out.println("Running "+threadName);
        try{
            for(int i=0;i>0;i--){
                System.out.println("Thread: "+threadName+","+i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Thread: "+threadName+"interrupted.");
        }
        System.out.println("Thread "+threadName+" exiting.");
    }
    public void start(){
        System.out.println("Starting "+threadName);
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
    public static void main(String[] args) {
	// write your code here
        MulT1 R1=new MulT1("Thread-1");
        R1.start();

        MulT1 R2=new MulT1("Thread-2");
        R2.start();
    }
}

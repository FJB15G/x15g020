package jp.ac.chibafjb.x15g020.kd152;

class SayHelloThread extends Thread 
{
    public void run() 
    {
        // "Hello, world!" と 10 回表示する
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println("Hello, world!  " + i);
        }
    }
}


public class Test01 {


	    public static void main(String[] args) {
	    	
	        SayHelloThread thread = new SayHelloThread();
	        
	        // 新しいスレッドで SayHelloThread.run() を実行する
	        thread.start();

	        // "こんにちは、世界！" と 10 回表示する
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("こんにちは、世界！  " + i);
	        }
	    }
}
	
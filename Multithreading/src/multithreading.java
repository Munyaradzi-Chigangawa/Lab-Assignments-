class MultithreadingDemo extends Thread{
    public void run(){
        System.out.println("My thread is in running state.");
    }
    public static void main(String args[]){
        MultithreadingDemo obj=new MultithreadingDemo();
        obj.start();
    }
}

// methods of Thread class
// getName(): It is used for Obtaining a thread’s name
//getPriority(): Obtain a thread’s priority
//isAlive(): Determine if a thread is still running
//join(): Wait for a thread to terminate
//run(): Entry point for the thread
//sleep(): suspend a thread for a period of time
//start(): start a thread by calling its run() method
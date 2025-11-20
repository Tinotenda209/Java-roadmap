public class MyThread extends Thread{

    public void run(){
        if (this.isDaemon()){
            System.out.println("daemon thread running");
        }else{
            System.out.println("User thread running");
        }

    }
}

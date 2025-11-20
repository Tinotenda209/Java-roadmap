//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        System.out.println(Thread.activeCount());
//        Thread.currentThread().setName("MAINNNN");
//        System.out.println(Thread.currentThread().getName());
//

Thread.currentThread().setPriority(10);
//

//        for (int i =3;i>0;i--){
//            System.out.println(i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
//        System.out.println("Your are Done");

        MyThread thread2 = new MyThread();
//        demom thread in background
  thread2.setDaemon(false);
        System.out.println(thread2.isDaemon());
        thread2.start();
//        System.out.println(thread2.isAlive());
//
//       thread2.setName("2nd Thread");
//        System.out.println(thread2.getName());
//  thread2.setPriority(1);
//        System.out.println(thread2.getPriority());
    }
}
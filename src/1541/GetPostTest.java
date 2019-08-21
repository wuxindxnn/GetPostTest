//
//import java.net.*;
//
//public class GetPostTest {
//   public static InheritableThreadLocal<String>inheritableThreadLocal=new InheritableThreadLocal<>();
//
//    public static void main(String args [] ) throws Exception{
//        System.out.println("主线程开启");
//        inheritableThreadLocal.set("主线程赋值");
//        new InheritableThreadLocalUsing().start();
//        System.out.println("休眠3s");
//        Thread.sleep(3000);
//        System.out.println("结束");
//    }
//}
//@Override
//public void run(){
//    System.out.println("子线程开启");
//    System.out.println("变量值"+InheritableThreadLocal.get());
//    System.out.println("子线程结束");
//}
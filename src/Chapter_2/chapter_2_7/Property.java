package Chapter_2.chapter_2_7;
import java.util.*;
//它能打印出与当前运行的系统有关的资料，并利用了来自Java 标 准库的 System 对象的多种方法。
public class Property {
    public static void main(String[] args) {
        System.out.println(new Date());
        Properties p=System.getProperties();
        p.list(System.out);
        System.out.println("---Memory Usage");
        Runtime rt =Runtime.getRuntime();
        System.out.println("Total Memory ="
                +rt.totalMemory()
                +" Free Memory ="
                +rt.freeMemory());

        //在某些编程环境里，程序会在屏幕上一切而过，甚至没机会看到结果
//        try {
//            Thread.currentThread().sleep(5 * 1000);
//        } catch (InterruptedException e) {
//        }
    }
}

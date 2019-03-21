package Chapter_5.Chapter_5_4.Chapter_5_4_1;

//在构造方法中调用构造方法
public class Flower {
    int petalCount=0;
    String s="initial value";

    public Flower(int petal) {
        petalCount = petal;
        System.out.println("Constructor w/ int arg only,petalCount = "+petalCount);
    }
    public Flower(String ss){
        System.out.println("Constructor w/ String arg only, s = " +ss);
        s=ss;
    }
    public Flower(String s,int petals){
        this(petals);
        //! this(s)//can't call two ！
        this.s=s;//Another use of "this"
        System.out.println("String & int args");
    }
    public Flower(){
        this("hi",47);
        System.out.println("default constructor (no args)");
    }
    void printPetalCount(){
        System.out.println("petalCount = "+petalCount+" s = "+s);
    }
    public static void main(String[] args) {
        Flower flower=new Flower();
        flower.printPetalCount();
    }
    //output
    //Constructor w/ int arg only,petalCount = 47
    //String & int args
    //default constructor (no args)
    //petalCount = 47 s = hi
    
    //this可以调用构造方法但不能调用两个,必须将构造方法位于起始处,否则编译器会报错
    //除构造方法外,编译器禁止在其他任何方法中调用构造方法
    //
}

package Chapter_3.Chapter_3_15.Chapter_3_15_1;

//截断与舍去
public class CastingNumbers {
    public static void main(String[] args) {
        double above=0.7,below=0.4;
        float fabove=0.7f,fbelow=0.4f;
        System.out.println("(int)above: "+(int)above);
        System.out.println("(int)below: "+(int)below);
        System.out.println("(int)fabove: "+(int)fabove);
        System.out.println("(int)fbelow: "+(int)fbelow);
    }
    //output:
//             (int)above: 0
//            (int)below: 0
//            (int)fabove: 0
//            (int)fbelow: 0
    //在将float或double转型为整型值时，总是对改数字末尾进行截尾
}

package Chapter_3.Chapter_3_8.Chapter_3_8_1;

//1. 短路 操作逻辑运算符时，我们会遇到一种名为“短路”的情况。这意味着只有明确得出整个表达式真或假的结论，
// 才会对表达式进行逻辑求值。
public class ShortCircuit {
    static boolean test1(int val) {
        System.out.println("test1(" + val + ")");
        System.out.println("result: " + (val < 1));
        return val < 1;
    }
    static boolean test2(int val) {
        System.out.println("test2(" + val + ")");
        System.out.println("result: " + (val < 2));
        return val < 2;
    }
        static boolean test3(int val) {
        System.out.println("test3(" + val + ")");
        System.out.println("result: " + (val < 3));
        return val < 3;
    }
    public static void main(String[] args) {
        if (test1(0) && test2(2) && test3(2)) {
            System.out.println("expression is true");
        } else {
            System.out.println("expression is false");
        }
    }
    //test1(0)
    //result: true
    //test2(2)
    //result: false
    //expression is false
    //第一个测试生成一个true 结果，所以表达式求值会继续下去。然而，第二个测试产生了一个 false 结果。
    // 由 于这意味着整个表达式肯定为 false，所以为什么还要继续剩余的表达式呢?
}







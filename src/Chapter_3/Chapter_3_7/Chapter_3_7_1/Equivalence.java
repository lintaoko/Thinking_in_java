package Chapter_3.Chapter_3_7.Chapter_3_7_1;

//equals ,==
class Value {
    int i;
}
public class Equivalence {
    //其中，表达式System.out.println(n1 == n2)可打印出内部的布尔比较结果。
    // 一般人都会认为输出结果肯定 先是true，再是 false，因为两个 Integer 对象都是相同的。
    // 但尽管对象的内容相同，句柄却是不同的，而 ==和!=比较的正好就是对象句柄。
    // 所以输出结果实际上先是 false，再是 true。这自然会使第一次接触的人 感到惊奇。
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println(n1.equals(n2));
    }
    //flase
    //true
    //true


//    此时的结果又变回了false!
//    这是由于 equals()的默认行为是比较句柄。所以除非在自己的新类中改变了 equals()，否则不可能表现出我们希望的行为。
//    大多数 Java 类库都实现了 equals()，所以它实际比较的是对象的内容，而非它们的句柄
//      public static void main(String[] args) {
//        Value v1 = new Value();
//        Value v2 = new Value();
//        v1.i = v2.i = 100;
//        System.out.println(v1.equals(v2));
//    }
    //false
}

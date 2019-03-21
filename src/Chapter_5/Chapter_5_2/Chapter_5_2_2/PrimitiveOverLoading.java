package Chapter_5.Chapter_5_2.Chapter_5_2_2;


//涉及基本类型的重载
public class PrimitiveOverLoading {
    void f1(char x){ System.out.print("f1(char)"); }
    void f1(byte x){ System.out.print("f1(byte)"); }
    void f1(short x){ System.out.print("f1(short)"); }
    void f1(int x){ System.out.print("f1(int)"); }
    void f1(long x){ System.out.print("f1(long)"); }
    void f1(float x){ System.out.print("f1(float)"); }
    void f1(double x){ System.out.print("f1(double)"); }

    void f2(byte x){ System.out.print("f2(byte)"); }
    void f2(short x){ System.out.print("f2(short)"); }
    void f2(int x){ System.out.print("f2(int)"); }
    void f2(long x){ System.out.print("f2(long)"); }
    void f2(float x){ System.out.print("f2(float)"); }
    void f2(double x){ System.out.print("f2(double)"); }

    void f3(byte x){ System.out.print("f3(byte)"); }
    void f3(short x){ System.out.print("f3(short)"); }
    void f3(int x){ System.out.print("f3(int)"); }
    void f3(long x){ System.out.print("f3(long)"); }
    void f3(float x){ System.out.print("f3(float)"); }
    void f3(double x){ System.out.print("f3(double)"); }

    void f4(int x){ System.out.print("f4(int)"); }
    void f4(long x){ System.out.print("f4(long)"); }
    void f4(float x){ System.out.print("f4(float)"); }
    void f4(double x){ System.out.print("f4(double)"); }

    void f5(long x){ System.out.print("f5(long)"); }
    void f5(float x){ System.out.print("f5(float)"); }
    void f5(double x){ System.out.print("f5(double)"); }

    void f6(float x){ System.out.print("f6(float)"); }
    void f6(double x){ System.out.print("f6(double)"); }

    void f7(double x){ System.out.print("f7(double)"); }

    void testConstVal(){
        System.out.print("5: ");
        f1(5);f2(5);f3(5);f4(5);f5(5);f6(5);f7(5);
        System.out.println();
    }
    void testChar(){
        char x='x';
        System.out.print("char : ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
        System.out.println();
    }
    void testByte(){
        byte x =0;
        System.out.print("byte : ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
        System.out.println();
    }
    void testShort(){
        short x=0;
        System.out.print("short : ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
        System.out.println();
    }
    void testInt(){
        int x=0;
        System.out.print("int : ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
        System.out.println();
    }
    void testLong(){
        long x=0;
        System.out.print("long : ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
        System.out.println();
    }
    void testFloat(){
        float x=0;
        System.out.print("float : ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
        System.out.println();
    }
    void testDouble(){
        double x=0;
        System.out.print("double : ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
        System.out.println();
    }

    public static void main(String[] args) {
        PrimitiveOverLoading primitiveOverLoading=new PrimitiveOverLoading();
        primitiveOverLoading.testConstVal();
        primitiveOverLoading.testChar();
        primitiveOverLoading.testByte();
        primitiveOverLoading.testShort();
        primitiveOverLoading.testInt();
        primitiveOverLoading.testLong();
        primitiveOverLoading.testFloat();
        primitiveOverLoading.testDouble();
    }
    //output
    //5: f1(int)f2(int)f3(int)f4(int)f5(long)f6(float)f7(double)
    //char : f1(char)f2(int)f3(int)f4(int)f5(long)f6(float)f7(double)
    //byte : f1(byte)f2(byte)f3(byte)f4(int)f5(long)f6(float)f7(double)
    //short : f1(short)f2(short)f3(short)f4(int)f5(long)f6(float)f7(double)
    //int : f1(int)f2(int)f3(int)f4(int)f5(long)f6(float)f7(double)
    //long : f1(long)f2(long)f3(long)f4(long)f5(long)f6(float)f7(double)
    //float : f1(float)f2(float)f3(float)f4(float)f5(float)f6(float)f7(double)
    //double : f1(double)f2(double)f3(double)f4(double)f5(double)f6(double)f7(double)

    //数值5会被当做int 处理 ,如果有重载方法接受int型参数就会被调用。
    //如果粗汉儒的数据类型(实际参数类型)小于方法中声明的形式的参数类型,实际数据类型就会被提升。
    //char行略有不同。如果无法找到敲好接受char的参数类型，就会把char直接提升至int型。
    //如果传入实际参数较大，就得通过类型转化来窄化。如果不这么做，编译器就会报错。
}

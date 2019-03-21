package Chapter_5.Chapter_5_4;


//simple use of the "this" keyword
public class Leaf {
    int i=0;
    Leaf increment(){
        i++;
        return this;
    }
    void  print(){
        System.out.println("i =" + i );
    }
    public static void main(String[] args) {
     Leaf leaf=new Leaf();
     leaf.increment().increment().increment().print();
    }
    //output
    //i =3
    //this关键字只能在方法内部使用,表示调用方法的对象。
}

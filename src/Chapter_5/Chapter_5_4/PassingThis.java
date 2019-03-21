package Chapter_5.Chapter_5_4;


class Person{
    public void eat(Apple apple){
        Apple peeled =apple.getPeeled();
        System.out.println("Yummy");
    }
}
class Peeler{
    static Apple peel(Apple apple){
        return apple;
    }
}
class Apple{
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}
public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }

    //Yummy

    //将自身传递给外部方法，Apple 必须使用this关键字
}

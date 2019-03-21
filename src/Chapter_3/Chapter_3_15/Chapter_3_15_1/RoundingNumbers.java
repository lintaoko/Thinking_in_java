package Chapter_3.Chapter_3_15.Chapter_3_15_1;

//截断与舍去
public class RoundingNumbers {
    public static void main(String[] args) {
        double above=0.7,below=0.4;
        float fabove=0.7f,fbelow=0.4f;
        System.out.println("Math.round(above): "+Math.round(above));
        System.out.println("Math.round(below): "+Math.round(below));
        System.out.println("Math.round(fabove): "+Math.round(fabove));
        System.out.println("Math.round(fbelow): "+Math.round(fbelow));
    }

    //output
    //Math.round(above): 1
    //Math.round(below): 0
    //Math.round(fabove): 1
    //Math.round(fbelow): 0
    //如果先要得到舍入的结果，就需要java.lang.Math中的round()方法
    //由于round()是java.lang的一部分,因此在使用它时不需要额外地导入。
}


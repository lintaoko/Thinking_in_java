package Chapter_4.Chapter_4_4;

import java.util.Random;

public class ForEachFloat {
    public static void main(String[] args) {
        Random random =new Random(47);
        float[]f=new float[10];
        for (int i=0;i<10;i++) f[i]=random.nextFloat();
        for (float x:f) System.out.println(x);
    }
    //output
    //0.72711575
    //0.39982635
    //0.5309454
    //0.0534122
    //0.16020656
    //0.57799757
    //0.18847865
    //0.4170137
    //0.51660204
    //0.73734957
    //for(float x:f)
    //定义一个float类型的变量x，将每一个f的元素赋值给x
    //foreach 可用于任何Iterable对象。 iterable:可迭代对象
}

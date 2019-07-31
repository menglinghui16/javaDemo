package javaBase;

/**
 * Created by Administrator on 2019/7/31.
 */
public class TestStaticStatement {
    static {//静态代码块：在类加载时执行静态代码块的内容；
        System.out.println("this is static statement");
    }
    String name = "suns";
    public void test(){}
    public static void main(String[] args) {}
}

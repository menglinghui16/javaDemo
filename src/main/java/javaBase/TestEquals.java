package javaBase;

/**
 * Created by Administrator on 2019/8/5.
 */
public class TestEquals {
    public static void main(String[] args) {
        String str1 = "qqq";
        String str2 = new String("qqq");
        if(str1.equals(str2)){
            System.out.println("str1等于str2");
            System.out.println("String类的equal()方法比较的是字符串内容相同即可；");
        }else{
            System.out.println("str1不等于str2");
        }
    }
}

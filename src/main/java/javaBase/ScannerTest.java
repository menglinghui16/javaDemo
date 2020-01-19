package javaBase;

import java.util.Scanner;

/**
 * Created by Administrator on 2019/7/29.
 */
public class ScannerTest {
    public static void main(String[] args) {
//        //导包java.util.Scanner；
//        //创建Scanner对象
//        Scanner input = new Scanner(System.in);
//        //获取控制台数据
//        String str = input.next();
//        int res = input.nextInt();
//        Double dou = input.nextDouble();

        Scanner sc = new Scanner(System.in);//System.in代表标准输入，就是键盘输入
        while (sc.hasNext()){
            System.out.println("键盘输入的内容是："+sc.next());
        }
    }
}

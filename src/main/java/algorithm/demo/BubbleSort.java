package algorithm.demo;

/**
 * Created by Administrator on 2019/4/10.
 * 冒泡排序--从大到小排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        Integer[] a = {22,26,12,55,66,34,98};
        for (int j = 0; j < a.length - 1; j++) {//外层循环控制排序轮数
            for (int i = 0; i < a.length - 1 - j; i++) {//内层循环控制每一轮排序多少次
               if(a[i] < a[i+1]){
                   int temp = a[i];
                   a[i] = a[i+1];
                   a[i+1] = temp;
                }
            }
        }
        System.out.println("排序后的数组为：");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

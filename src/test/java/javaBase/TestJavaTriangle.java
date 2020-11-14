package javaBase;

import org.junit.Test;

/**
 * @Author: menglh
 * @Description:
 * @Date: 2020/11/13 16:43
 */
public class TestJavaTriangle {
    @Test
    public void testWhile(){
        int count = 1;
        while (count <= 5){
            System.out.println("hello world "+ count);
            count++;
        }
    }

    /**
     *    *
     *    **
     *    ***
     */
    @Test
    public void testSanjiao(){
        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

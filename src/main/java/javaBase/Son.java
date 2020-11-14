package javaBase;

/**
 * @Author: menglh
 * @Description:
 * @Date: 2020/11/14 15:38
 */
public class Son extends FatherSupper {
    String name = "儿子";
    Integer age = 30;

    public void getName() {
        System.out.println("这是：" + super.name);
    }

}

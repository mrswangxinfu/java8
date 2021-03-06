package java8.wxf.test;

import java.util.ArrayList;
import java.util.List;

public class MemErrorTest {
    public static void main(String[] args) {
//        try {
//            List<Object> list = new ArrayList<Object>();
//            for(;;) {
//                list.add(new Object()); //创建对象速度可能高于jvm回收速度
//            }
//        } catch (OutOfMemoryError e) {
//            e.printStackTrace();
//        }

//        try {
//            hi();//递归造成StackOverflowError 这边因为每运行一个方法将创建一个栈帧，栈帧创建太多无法继续申请到内存扩展
//        } catch (StackOverflowError e) {
//            e.printStackTrace();
//        }

        try {
            Float[] as = new Float[999999999];
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
    }

    public static void hi() {
        hi();
    }
}

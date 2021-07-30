package java8.wxf.gof.createType.prototype;

/**
 * 原型模式：
 * 使用原型实例指定要创建对象的类型，通过复制这个原型来创建新对象。
 *
 * 浅克隆：复制 已有对象 的属性的基本数据类型以及引用类型的 地址 。
 * 深克隆：复制 已有对象 的属性的基本数据类型以及复制引用类型的 数据 。
 */
public abstract class Prototype {

    abstract Prototype myClone();

    public void te1(){
        System.out.println("prototype的te1()");
    }
    public void te2(){
        System.out.println("prototype的te2()");
    }
}

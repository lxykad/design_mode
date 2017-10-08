package mode.design.lxy.com.designmode.factory;

/**
 * Created by lxy on 2017/10/8.
 * 工厂方法模式分为四大模块
 * 1、抽象工厂
 * 2、具体工厂
 * 3、抽象产品
 * 4、具体产品
 */

//抽象工厂 具体生产什么产品由子类实现
public abstract class Factory {

    public abstract <T extends Product> T createProduct(Class<T> clz);

//    public static Product createProduct(){
//        return new GirlFriendProduct();
//    }
}

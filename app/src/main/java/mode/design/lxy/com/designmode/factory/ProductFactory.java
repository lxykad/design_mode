package mode.design.lxy.com.designmode.factory;

/**
 * Created by lxy on 2017/10/8.
 * 具体工厂--生产女(男)朋友
 */

public class ProductFactory extends Factory {

    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clz.getName()).newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}

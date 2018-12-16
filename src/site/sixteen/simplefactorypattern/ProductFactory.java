package site.sixteen.simplefactorypattern;

/**
 * 产品工厂类，用于生产产品
 *
 * @author panhainan
 * @version 1.0
 * @date 2018/12/12 14:01
 */
public class ProductFactory {

    public static Product produce(ProductType productType) {
        switch (productType.type()) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                return null;
        }
    }
}

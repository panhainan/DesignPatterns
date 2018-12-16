package site.sixteen.simplefactorypattern;

/**
 * 简单工厂模式示例
 *
 * @author panhainan
 * @version 1.0
 * @date 2018/12/12 14:04
 */
public class SimpleFactoryPatternTest {
    public static void main(String[] args) {
        ProductFactory.produce(ProductType.A).show();
        ProductFactory.produce(ProductType.B).show();
    }
}

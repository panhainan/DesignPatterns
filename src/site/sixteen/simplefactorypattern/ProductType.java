package site.sixteen.simplefactorypattern;

/**
 * 产品类型枚举
 *
 * @author panhainan
 * @version 1.0
 * @date 2018/12/12 14:08
 */
public enum ProductType {
    /**
     * A类产品
     */
    A("A"),
    /**
     * B类产品
     */
    B("B");

    private String name;

    ProductType(String typeName) {
        this.name = typeName;
    }

    public String type() {
        return name;
    }
}

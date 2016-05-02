package framework;

/**
 * Created by Woo on 2016-05-02.
 */
public abstract class Factory {
    public final Product create(String onwer) {
        Product p = createProduct(onwer);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String onwer);
    protected abstract void registerProduct(Product product);

}

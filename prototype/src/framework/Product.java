package framework;

/**
 * Created by Woo on 2016-05-16.
 */
public interface Product extends Cloneable{
    void use(String s);
    Product createClone();
}

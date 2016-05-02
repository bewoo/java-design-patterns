package idcard;

import framework.Factory;
import framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Woo on 2016-05-02.
 */
public class IDCFactory extends Factory {
    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
}

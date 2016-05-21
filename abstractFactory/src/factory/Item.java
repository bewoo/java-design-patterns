package factory;

/**
 * Created by Woo on 2016-05-21.
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}

package factory;

import java.util.ArrayList;

/**
 * Created by Woo on 2016-05-21.
 */
public abstract class Tray extends Item {
    protected ArrayList<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item) {
        tray.add(item);
    }
}

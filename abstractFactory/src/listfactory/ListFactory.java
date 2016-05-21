package listfactory;

import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;

/**
 * Created by Woo on 2016-05-21.
 */
public class ListFactory extends Factory{
    @Override
    public Link createLink(String catpion, String url) {
        return new ListLink(catpion, url);
    }

    @Override
    public Tray createTray(String catpion) {
        return new ListTray(catpion);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}

package factory;

/**
 * Created by Woo on 2016-05-21.
 */
public abstract class Link extends Item{
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}

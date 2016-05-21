package listfactory;

import factory.Link;

/**
 * Created by Woo on 2016-05-21.
 */
public class ListLink extends Link{

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href=\"" + url + "\">"+ caption +"</a></li>\n";
    }
}

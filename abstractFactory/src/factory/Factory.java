package factory;

/**
 * Created by Woo on 2016-05-21.
 */
public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String catpion, String url);
    public abstract Tray createTray(String catpion);
    public abstract Page createPage(String title, String author);
}

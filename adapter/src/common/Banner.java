package common;

/**
 * Created by Woo on 2016-04-29.
 */
public class Banner {
    private String string;
    public Banner(String string) {
        this.string = string;
    }
    public void showWithParen() {
        System.out.println("("+string+")");
    }

    public void showWithAster() {
        System.out.println("*"+string+"*");
    }
}

import delegation.Print;
import delegation.PrintBanner;

/**
 * Created by Woo on 2016-04-29.
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printString();
    }
}

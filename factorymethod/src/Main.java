import framework.Factory;
import framework.Product;
import idcard.IDCFactory;

/**
 * Created by Woo on 2016-05-02.
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCFactory();
        Product card1 = factory.create("홍길동");
        Product card2 = factory.create("이순신");
        Product card3 = factory.create("강감찬");
        card1.use();
        card2.use();
        card3.use();
    }
}

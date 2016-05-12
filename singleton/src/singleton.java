/**
 * Created by Woo on 2016-05-12.
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}

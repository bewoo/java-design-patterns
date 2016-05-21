package factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * Created by Woo on 2016-05-21.
 */
public abstract class Page {
    protected String title;
    protected  String author;
    protected ArrayList<Item> content = new ArrayList<>();

    public Page(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + " 을 작성했습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}

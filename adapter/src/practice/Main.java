package practice;

import java.io.IOException;

/**
 * Created by Woo on 2016-05-02.
 */
public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("adapter/file.txt");
            f.setValue("year","2016");
            f.setValue("month","05");
            f.setValue("day","02");
            f.writeToFile("adapter/newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

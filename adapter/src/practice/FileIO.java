package practice;

import java.io.IOException;

/**
 * Created by Woo on 2016-05-02.
 */
public interface FileIO {
    void readFromFile(String filename) throws IOException;
    void writeToFile(String filename) throws IOException;
    void setValue(String key, String value);
    String getValue(String key);
}

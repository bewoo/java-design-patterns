package practice2;

/**
 * Created by Woo on 2016-05-12.
 */
public class Triple {
    private int id;
    private static Triple[] triples = {
            new Triple(0), new Triple(1), new Triple(2),
    };

    private Triple(int id) {
        this.id = id;
    }

    public Triple getInstance(int id) {
        return triples[id];
    }
}

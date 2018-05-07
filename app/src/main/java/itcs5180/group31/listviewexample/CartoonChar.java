package itcs5180.group31.listviewexample;

/**
 * Created by ivory on 5/7/18.
 */

public class CartoonChar {
    String name, show, species, gender, imgUrl;

    public CartoonChar(String name, String show, String species, String gender) {
        this.name = name;
        this.show = show;
        this.species = species;
        this.gender = gender;
    }

    public CartoonChar(String name, String show) {
        this.name = name;
        this.show = show;
    }

    @Override
    public String toString() {
        return "CartoonChar{" +
                "name='" + name + '\'' +
                ", show='" + show + '\'' +
                ", species='" + species + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

package itcs5180.group31.listviewexample;

/**
 * Created by ivory on 5/7/18.
 */

public class Dessert {
    String name, imgUrl;
    int calories;

    public Dessert(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "name='" + name + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", calories=" + calories +
                '}';
    }
}

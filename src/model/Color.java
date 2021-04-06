package model;

public class Color implements Comparable<Color> {

    public String color;

    public Color(String color) {
        this.color = color;
    }

    @Override
    public int compareTo(Color o) {
        return color.compareTo(o.color);
    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                '}';
    }
}

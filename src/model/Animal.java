package model;

public class Animal implements Comparable<Animal> {
    public String noise;

    public Animal (String noise) {
        this.noise = noise;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "noise='" + noise + '\'' +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        return noise.compareTo(o.noise);
    }
}

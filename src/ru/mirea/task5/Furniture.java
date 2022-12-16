package ru.mirea.task5;
// диван / стул
public abstract class Furniture {
    protected String material;
    protected double weight;

    Furniture(String material, double weight) {
        this.material = material;
        this.weight = weight;
    }

    public abstract String breakIt();
}

class Chair extends Furniture {
    private Boolean soft;

    Chair(String material, double weight, Boolean soft) {
        super(material, weight);
        this.soft = soft;
    }

    public String getMaterial() {
        return material;
    }

    public double getWeight() {
        return weight;
    }

    public Boolean getSoft() {
        return soft;
    }

    public String breakIt() {
        return "Ooops, you broke it...";
    }

    @Override
    public String toString() {
        return "Chair{material=" + material + ", weight=" + weight +
                ", soft=" + soft +
                '}';
    }
}

class Sofa extends Furniture {
    private Boolean soft;

    Sofa(String material, double weight, Boolean soft) {
        super(material, weight);
        this.soft = soft;
    }

    public String getMaterial() {
        return material;
    }

    public double getWeight() {
        return weight;
    }

    public Boolean getSoft() {
        return soft;
    }

    public String breakIt() {
        return "Ooops, you broke it...";
    }

    @Override
    public String toString() {
        return "Sofa{material=" + material + ", weight=" + weight +
                ", soft=" + soft +
                '}';
    }
}
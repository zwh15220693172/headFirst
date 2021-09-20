package prototype.clone;

public class Sheep implements Cloneable {
    private String name;
    private Human human;

    public Sheep(String name, Human human) {
        this.name = name;
        this.human = human;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep clone = (Sheep) super.clone();
        Human cloneHuman = (Human) human.clone();
        clone.setHuman(cloneHuman);
        return clone;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", human=" + human.hashCode() +
                '}';
    }
}

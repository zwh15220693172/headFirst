package prototype.stream;

import java.io.*;

public class Sheep implements Serializable {
    public static final long serialVersionUID = 1L;

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
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        Sheep deep = null;
        try{
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            byte[] bytes = bos.toByteArray();
            bis = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bis);
            deep = (Sheep) ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return deep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", human=" + human.hashCode() +
                '}';
    }
}

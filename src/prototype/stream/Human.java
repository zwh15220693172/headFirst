package prototype.stream;

import java.io.Serializable;

public class Human implements Serializable {
    public static final long serialVersionUID = 2L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

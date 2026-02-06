package pizzacutting;

public class Wheel {
    private int size;
    private String type;

    public Wheel() {
    }

    public Wheel(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public void displayWheel() {
        System.out.println("Wheel Size: " + size + ", Type: " + type);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

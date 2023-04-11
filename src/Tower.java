public class Tower {
    String color;
    int height;
    int index;

    public Tower(String color, int height, int index){
        this.color = color;
        this.height = height;
        this.index = index;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getIndex() {
        return index;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

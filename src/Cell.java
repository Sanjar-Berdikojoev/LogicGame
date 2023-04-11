public class Cell {
    boolean condition;
    int index;
    public Cell(boolean condition, int index){
        this.condition = condition;
        this.index = index;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public int getIndex() {
        return index;
    }
}

public class Cubic {
    int line;

    public Cubic(int cubic) {
        this.line = cubic;
    }

    public void setLine(int cubic) {
        this.line = cubic;
    }

    public int getLine() {
        return this.line;
    }

    public int getS() {
        
        return this.line * this.line * 6;
    }
}

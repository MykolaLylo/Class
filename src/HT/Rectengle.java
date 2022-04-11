package HT;

public class Rectengle {
    private double length;
    private double width;

    public Rectengle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectengle (){
        this.length = 55;
        this.width = 66;
    }
    public int square (){
        int square = (int) (length * width);
        ;
        return square;
    }
    public int perimeter(){
        int perimeter = (int) ((length + width)*2);
        return perimeter;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
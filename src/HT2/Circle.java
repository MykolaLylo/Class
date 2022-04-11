package HT2;

public class Circle {
    private double radius;
    private double diameter;
    public Circle (double radius, double diameter){
        this.radius = radius;
        this.diameter = diameter;

    }
    public Circle () {

    }
    public void square () {

        System.out.println("Square of circle:" + diameter);

    }
    public void length (){
        System.out.println("Length of circle:"+ radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}

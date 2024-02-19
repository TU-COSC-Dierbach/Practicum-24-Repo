public class Circle{
  private double radius;

  // constructor
  public Circle(double radius) {
    radius = this.radius;
  }

  // getter/setter methods
  public double getRadius() {
    return radius;
  }

  public void setRadius(double r) {
    this.radius = radius;
  }

  // area
  public double area() {
    return (Math.PI * radius * radius);
  }
}
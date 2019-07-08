package solution;

/*
 * The Rectangle class, subclass of Shape
 */
public class Rectangle extends Shape {
   // Private member variables
   private double length;
   private double width;
   
   // Constructor
   public Rectangle(){
	   super();
	   length = 0.0;
	   width = 0.0;
	   
   }
   public Rectangle(String color, double length, double width) {
      super(color);
      this.length = length;
      this.width = width;
   }
   
   @Override
   public String toString() {
      return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() + "]";
   }
   
   // Override the inherited getArea() to provide the proper implementation
   @Override
   public double getArea() {
      return length*width;
   }
   
   public double getArea(double length, double width) {
   	  this.length = length;
      this.width = width;
      return getArea();
   }
}
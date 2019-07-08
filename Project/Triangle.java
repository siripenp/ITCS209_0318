package sol;


public class Triangle extends Shape {
   // Private member variables
   private double base;
   private double height;
   
   // Constructor
   public Triangle()
   {
	   super();
	   base = 0.0;
	   height = 0.0;
   }
   public Triangle(String color, double base, double height) {
      super(color);
      this.base = base;
      this.height = height;
   }
   
   @Override
   public String toString() {
      return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
   }
   
   // Override the inherited getArea() to provide the proper implementation
   @Override
   public double getArea() {
      return 0.5*base*height;
   }
   public double getArea(double base, double height) {
	   	this.base = base;
	    this.height = height;
	      return getArea();
	   }
}
package example;

public class Rectangle {
	public int x, y, width, height;
	
	public Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
	}	
	
	// Overriding equals() to compare two Rectangle objects 
    @Override
    public boolean equals(Object o) { 
  
        // If the object is compared with itself then return true   
        if (o == this) { 
            return true; 
        } 
  
        // Check if o is an instance of Rectangle or not 
        if (!(o instanceof Rectangle)) { 
            return false; 
        } 
          
        // typecast o to Rectangle so that we can compare instance fields 
        Rectangle r = (Rectangle) o; 
          
        // Compare the instance fields and return accordingly  
        boolean eq = false;
        if(this.x == r.x && this.y == r.y && this.width == r.width && this.height == r.height) {
        	eq = true;
        }
        return eq;
    } 
    
    public static void main(String[] args) {
    	Rectangle box1 = new Rectangle(5, 10, 20, 30); 
    	Rectangle box2 = box1; 
    	Rectangle box3 = new Rectangle(5, 10, 20, 30); 
    	
    	System.out.println(box1 == box2); 	// true
    	System.out.println(box1 == box3);	// false
    	System.out.println(box2 == box3);	// false
    	
    	System.out.println(box1.equals(box2));	// true
    	System.out.println(box1.equals(box3));	// true
    	System.out.println(box2.equals(box3));	// true

	}
		
}

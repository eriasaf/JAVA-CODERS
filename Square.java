public class Square {
    /* fields */ 
    double length;	
    double width;

/* constructor */
public Square(double length, double width) {
    this.length = length;
    this.width = width;
}	 	 

    /* accessors */
    public double getLength() { 
    
        return this.length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth() { 
        return this.width; 
    }

    public void setWidth(double length){
        this.length = length;
    }
    
}

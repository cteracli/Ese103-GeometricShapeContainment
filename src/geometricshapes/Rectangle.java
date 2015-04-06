package geometricshapes;

public class Rectangle extends GeometricShape{
    protected double xV;
    protected double yV;
    protected double xSideLength;
    protected double ySideLength;

    public Rectangle(double xV, double yV, double xSideLength, double ySideLength){
        this.xV = xV;
        this.yV = yV;
        if(ySideLength<=0 || xSideLength<=0) {
            throw new IllegalArgumentException("Il lato deve essere > di 0");
        }		
        this.ySideLength = ySideLength;	
        this.xSideLength = xSideLength;
    }
    
    public double getXV() {
        return xV;
    }
    public double getYV() {
        return yV;
    }
    public double getXSideLength() {
        return xSideLength;
    }
    public double getYSideLength() {
        return ySideLength;
    }
    
    public void setXV(double xV) {
        this.xV = xV;
    }
    public void setYV(double yV) {
        this.yV = yV;
    }  
    public void setXSideLength(double xSideLength) {
        if(xSideLength<=0) {
            throw new IllegalArgumentException("Il lato deve essere > di 0");
        }		
        this.xSideLength = xSideLength;
    }
    public void setYSideLength(double ySideLength) {
        if(ySideLength<=0) {
            throw new IllegalArgumentException("Il lato deve essere > di 0");
        }		
        this.ySideLength = ySideLength;
    }
    
    @Override
    public double getXMin(){
        return this.xV;
    }
    @Override
    public double getYMin(){
        return this.yV;
    }
    @Override
    public double getXMax(){
        return this.xV + this.xSideLength;
    }
    @Override
    public double getYMax(){
        return this.yV + this.ySideLength;
    }
    
    @Override
    public String toString() {
	return "Rectangle [xV=" + xV + ", yV=" + yV + ", xSideLength=" + xSideLength + ", ySideLength=" + ySideLength + "]";			
    } 
    
}
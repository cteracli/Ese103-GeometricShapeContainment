package geometricshapes;

abstract public class GeometricShape {
    abstract public double getXMin();
    abstract public double getXMax();
    abstract public double getYMin();
    abstract public double getYMax();
    
    public boolean contains(GeometricShape s){
        
        boolean contains = true;
        if(this.getXMin() > s.getXMin()){
            contains = false;
        }
        if(this.getYMin() > s.getYMin()){
            contains = false;
        }
        if(this.getXMax() < s.getXMax()){
            contains = false;
        }
        if(this.getYMax() < s.getYMax()){
            contains = false;
        }
        return contains; 
    }
    
}
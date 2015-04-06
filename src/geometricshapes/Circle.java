package geometricshapes;

public class Circle {
    private double xC;
    private double yC;
    private double r;
			
    public Circle(double xC, double yC, double r){
        this.xC=xC;
        this.yC=yC;
        if(r<=0)
            throw new IllegalArgumentException("Il raggio deve essere > di 0");
        else 
            this.r=r;
    }
    
    public double getXC(){
        return xC;
    }
    public double getYC(){
        return yC;
    }
    public double getR(){
        return r;
    }

    public void setXC(double xC){
        this.xC=xC;
    }
    public void setYC(double yC){
        this.yC=yC;
    }
    public void setR(double r){
        if(r<=0)
            throw new IllegalArgumentException("Il raggio deve essere > di 0");
        else 
            this.r=r;
    }
    
    
    public double getXMin(){
        double xMin=xC-r;
        return xMin;
    }
    public double getYMin(){
        double yMin=yC-r;
        return yMin;
    }
    public double getXMax(){
        double xMax=xC+r;
        return xMax;
    }
    public double getYMax(){
        double yMax=yC+r;
        return yMax;
    }

    public boolean contains(Circle c) {
        
        boolean contains = true;
        if(this.getXMin() > c.getXMin()){
            contains = false;
        }
        if(this.getYMin() > c.getYMin()){
            contains = false;
        }
        if(this.getXMax() < c.getXMax()){
            contains = false;
        }
        if(this.getYMax() < c.getYMax()){
            contains = false;
        }
        return contains;
    }

    @Override
    public String toString() {
            return "Circle [xC=" + xC + ", yC=" + yC + ", r=" + r + "]";
    }
    
}
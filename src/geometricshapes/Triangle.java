package geometricshapes; 

public class Triangle extends GeometricShape{
    private double xV;
    private double yV;
    private double l;
    
	
    public Triangle(double xV, double yV, double l){
        this.xV=xV;
        this.yV=yV;
        if(l<=0)
                throw new IllegalArgumentException("Il lato deve essere > di 0");
        else 
                this.l=l;
    }
    
    public double getXV(){
        return xV;
    }
    public double getYV(){
        return yV;
    }
    public double getH(){
        return l;
    }

    public void setXV(double xV){
        this.xV=xV;
    }
    public void setYV(double yV){
        this.yV=yV;
    }
    public void setL(double l){
        if(l<=0)
            throw new IllegalArgumentException("Il lato deve essere > di 0");
        else 
            this.l=l;
    }
    
    @Override
    public double getXMin(){
        double xMin=xV-l;
        return xMin;
    }
    @Override
    public double getYMin(){
        double yMin=yV-l;
        return yMin;
    }
    @Override
    public double getXMax(){
        double xMax=xV+l;
        return xMax;
    }
    @Override
    public double getYMax(){
        double yMax=yV+l;
        return yMax;
    }

    public boolean contains(Triangle t) {
        boolean contains = true;
        if(this.getXMin() > t.getXMin()){
            contains = false;
        }
        if(this.getYMin() > t.getYMin()){
            contains = false;
        }
        if(this.getXMax() < t.getXMax()){
            contains = false;
        }
        if(this.getYMax() < t.getYMax()){
            contains = false;
        }
        return contains;
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
           return "Triangle [xV=" + xV + ", yV=" + yV + ", l=" + l + "]";
   }

}
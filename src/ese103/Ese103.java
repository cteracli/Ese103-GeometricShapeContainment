package ese103;

import geometricshapes.*;

public class Ese103 {

    public static void main(String[] args) {
        GeometricShape shapeArray[] = new GeometricShape[6];
        shapeArray[0] = new Circle(0, 0, 1);
        shapeArray[1] = new Circle(0, 0, 0.5);
        shapeArray[2] = new Circle(0.5, 0.5, 1);
        shapeArray[3] = new Triangle(0, 0, 1);
        shapeArray[4] = new Triangle(0, 0, 0.5);
        shapeArray[5] = new Triangle(0.5, 0.5, 1);
        
        for(GeometricShape a: shapeArray){
            for(GeometricShape b: shapeArray){
                if(a != b){
                    if (a.contains(b)){
                        System.out.println(a + " contiene " + b);
                    }else{
                        System.out.println(a + " NON contiene " + b);
                    }				
                }else{
                    System.out.println(a + " è uguale a " + b);
                }
            }  
        }
    }
}
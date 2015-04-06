package ese103;

import geometricshapes.*;

public class Ese103 {

    public static void main(String[] args) {
        
        GeometricShape shapeArray[] = new GeometricShape[8];
        shapeArray[0] = new Circle(1, 1, 1);
        shapeArray[1] = new Circle(1, 1, 0.5);
        shapeArray[2] = new Triangle(1, 1, 1);
        shapeArray[3] = new Triangle(1, 1, 0.5);
        shapeArray[4] = new Rectangle(1, 1, 1, 2);
        shapeArray[5] = new Rectangle(1, 1, 0.5, 1);
        shapeArray[6] = new Square(1, 1, 1);
        shapeArray[7] = new Square(1, 1, 0.5);
        
        
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

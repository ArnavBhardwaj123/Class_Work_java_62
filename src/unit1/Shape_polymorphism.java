package unit1;

public class Shape_polymorphism {
    public void draw(double l , double b){
        double area = l*b;
        System.out.println("The  area of polymorphihsm rectangle:"+area);
    }
    public void draw(double l  ){
        double area = l*l;
        System.out.println("The  area of polymorphihsm square:"+area);
    }
}

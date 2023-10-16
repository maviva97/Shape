import shape.*;

public class Main {
    private static TwoDimensionalShape x;

    public static void main(String[] args) {

        Circle cerc=new Circle();
        cerc.draw();
        Sphere sfera=new Sphere();
        sfera.draw();
        Square patrat=new Square();
        patrat.draw();
        Cube cub=new Cube();
        cub.draw();
     ThreeDimensionalShape dtre=new ThreeDimensionalShape();
     dtre.getArea();
     dtre.getVolume();
     TwoDimensionalShape don=new TwoDimensionalShape();
     don.getArea();
    }
}
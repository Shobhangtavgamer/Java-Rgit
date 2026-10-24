import java.util.Scanner;

class Geometry {
    private double radius;

    public void setRadius(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }
}

class SphereGeometry extends Geometry {
    public double surfaceArea() {
        return 4.0 * Math.PI * getRadius() * getRadius();
    }

    public void show() {
        System.out.println("Radius  = " + getRadius());
        System.out.println("Surface area = " + surfaceArea());
    }
}

class SphereVolumeCalculator extends SphereGeometry {
    public double computeVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    }

    public void showVolume() {
        System.out.println("Volume  = " + computeVolume());
    }
}

public class SphereVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        SphereVolumeCalculator calculator = new SphereVolumeCalculator();
        calculator.setRadius(radius);
        calculator.show();
        calculator.showVolume();
    }
}

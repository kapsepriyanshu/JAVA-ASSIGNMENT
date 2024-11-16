abstract class ThreeDObject {
    abstract double volume();
    abstract double wholeSurfaceArea();
}

class Box extends ThreeDObject {
    double length, width, height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double volume() {
        return length * width * height;
    }

    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }
}

class Cylinder extends ThreeDObject {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }

    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

class TestObjects {
    public static void main(String[] args) {
        Box box = new Box(2, 3, 4);
        Cylinder cylinder = new Cylinder(3, 5);

        System.out.println("Box Volume: " + box.volume());
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
    }
}

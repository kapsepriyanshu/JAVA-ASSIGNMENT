class Distance {
    double miles;

    Distance(double miles) {
        this.miles = miles;
    }

    void travelTime() {
        double speed = 60; // miles per hour
        double time = miles / speed;
        System.out.println("Time taken in hours: " + time);
    }
}

class DistanceMKS extends Distance {
    DistanceMKS(double kilometers) {
        super(kilometers * 0.621371); // Convert kilometers to miles
    }

    @Override
    void travelTime() {
        double speed = 100; // km per hour
        double kilometers = miles / 0.621371; // Convert miles back to kilometers
        double time = kilometers / speed;
        System.out.println("Time taken in hours (MKS): " + time);
    }
}

class TestDistance {
    public static void main(String[] args) {
        Distance d1 = new Distance(120); // 120 miles
        d1.travelTime();

        DistanceMKS d2 = new DistanceMKS(200); // 200 kilometers
        d2.travelTime();
    }
}

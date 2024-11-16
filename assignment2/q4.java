class ConstructorOverloading {
    ConstructorOverloading() {
        System.out.println("Zero-Arguments Constructor");
    }

    ConstructorOverloading(int number) {
        System.out.println("Parameterized Constructor with number: " + number);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(42);
    }
}

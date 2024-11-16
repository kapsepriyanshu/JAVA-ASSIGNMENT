class StaticKeywordExample {
    static int counter = 0;

    StaticKeywordExample() {
        counter++;
    }

    static void displayCounter() {
        System.out.println("Number of objects created: " + counter);
    }
}

class TestStatic {
    public static void main(String[] args) {
        new StaticKeywordExample();
        new StaticKeywordExample();
        StaticKeywordExample.displayCounter();
    }
}

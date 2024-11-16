class Parent {
    static void show() {
        System.out.println("Parent class static method");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child class static method");
    }
}

class MethodHidingExample {
    public static void main(String[] args) {
        Parent.show();
        Child.show();
    }
}

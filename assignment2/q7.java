class Parent {
    void display() {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child class display method");
    }
}

class MethodOverridingExample {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}

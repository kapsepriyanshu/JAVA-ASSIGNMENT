class GrandParent {
    void showGrandParent() {
        System.out.println("This is the GrandParent class.");
    }
}

class Parent extends GrandParent {
    void showParent() {
        System.out.println("This is the Parent class.");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("This is the Child class.");
    }
}

class MultilevelInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showGrandParent();
        obj.showParent();
        obj.showChild();
    }
}

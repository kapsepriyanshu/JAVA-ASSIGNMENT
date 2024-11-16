interface A {
    void methodA1();
    void methodA2();
}

interface B {
    void methodB1();
    void methodB2();
}

interface C {
    void methodC1();
    void methodC2();
}

interface D extends A, B, C {
    void methodD();
}

class ConcreteClass {
    void baseMethod() {
        System.out.println("Base class method");
    }
}

class DerivedClass extends ConcreteClass implements D {
    public void methodA1() {
        System.out.println("Method A1");
    }

    public void methodA2() {
        System.out.println("Method A2");
    }

    public void methodB1() {
        System.out.println("Method B1");
    }

    public void methodB2() {
        System.out.println("Method B2");
    }

    public void methodC1() {
        System.out.println("Method C1");
    }

    public void methodC2() {
        System.out.println("Method C2");
    }

    public void methodD() {
        System.out.println("Method D");
    }
}

class TestInterfaces {
    static void useA(A obj) {
        obj.methodA1();
        obj.methodA2();
    }

    static void useB(B obj) {
        obj.methodB1();
        obj.methodB2();
    }

    static void useC(C obj) {
        obj.methodC1();
        obj.methodC2();
    }

    static void useD(D obj) {
        obj.methodD();
    }

    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        useA(obj);
        useB(obj);
        useC(obj);
        useD(obj);
    }
}

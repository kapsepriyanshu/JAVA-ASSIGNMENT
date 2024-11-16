class Num {
    int number;

    Num(int number) {
        this.number = number;
    }

    void showNum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {
    HexNum(int number) {
        super(number);
    }

    @Override
    void showNum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}

class TestHexNum {
    public static void main(String[] args) {
        Num obj1 = new Num(42);
        obj1.showNum();
        HexNum obj2 = new HexNum(42);
        obj2.showNum();
    }
}

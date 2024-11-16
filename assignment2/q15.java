class ThisKeywordExample {
    int value;

    ThisKeywordExample(int value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + this.value);
    }
}

class TestThis {
    public static void main(String[] args) {
        ThisKeywordExample obj = new ThisKeywordExample(42);
        obj.display();
    }
}

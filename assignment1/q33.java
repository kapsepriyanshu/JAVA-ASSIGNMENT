class Commission {
    private double sales;

    Commission(double sales) {
        if (sales < 0) {
            System.out.println("Invalid Input");
            this.sales = 0;
        } else {
            this.sales = sales;
        }
    }

    double commission() {
        return sales * 0.1;
    }
}

class CommissionDemo {
    public static void main(String[] args) {
        Commission obj = new Commission(5000);
        if (obj.commission() > 0) {
            System.out.println("Commission: " + obj.commission());
        }
    }
}

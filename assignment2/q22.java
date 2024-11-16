class DivideByZeroException extends Exception {
    DivideByZeroException(String message) {
        super(message);
    }
}

class NegativeResultException extends Exception {
    NegativeResultException(String message) {
        super(message);
    }
}

class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0, c = 5;
            if (b == 0) {
                throw new DivideByZeroException("Cannot divide by zero");
            }
            int result = a / b - c;
            if (result < 0) {
                throw new NegativeResultException("Result is negative");
            }
            System.out.println("Result: " + result);
        } catch (DivideByZeroException | NegativeResultException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

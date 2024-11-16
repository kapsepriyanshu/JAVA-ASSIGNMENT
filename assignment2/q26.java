class NegativeAgeException extends Exception {
    NegativeAgeException(String message) {
        super(message);
    }
}

class PersonDetails {
    public static void main(String[] args) {
        try {
            String name = "Alice";
            int age = -5;

            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative.");
            }

            System.out.println("Name: " + name + ", Age: " + age);
        } catch (NegativeAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

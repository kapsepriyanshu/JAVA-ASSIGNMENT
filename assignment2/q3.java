class ParameterizedConstructor {
    ParameterizedConstructor(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor("Hello, World!");
    }
}

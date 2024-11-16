class q1 {
    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = (celsius * 9/5) + 32; // Formula for Celsius to Fahrenheit
        System.out.println("Celsius to Fahrenheit: " + fahrenheit);
        
        celsius = (fahrenheit - 32) * 5/9; // Formula for Fahrenheit to Celsius
        System.out.println("Fahrenheit to Celsius: " + celsius);
    }
}

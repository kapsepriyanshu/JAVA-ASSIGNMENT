class ConvertTemperature {
    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Celsius: " + celsius);
    }
}

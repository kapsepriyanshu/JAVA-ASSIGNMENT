class TooHot extends Exception {
    TooHot(String message) {
        super(message);
    }
}

class TooCold extends Exception {
    TooCold(String message) {
        super(message);
    }
}

class TemperatureCheck {
    public static void main(String[] args) {
        try {
            int temperature = Integer.parseInt(args[0]);
            if (temperature > 35) {
                throw new TooHot("Temperature is too hot!");
            } else if (temperature < 5) {
                throw new TooCold("Temperature is too cold!");
            } else {
                System.out.println("Normal Temperature");
                double fahrenheit = (temperature * 9.0 / 5) + 32;
                System.out.println("In Fahrenheit: " + fahrenheit);
            }
        } catch (TooHot | TooCold e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

import java.util.HashMap;

class NoMatchFoundException extends Exception {
    NoMatchFoundException(String message) {
        super(message);
    }
}

class CapitalFinder {
    public static void main(String[] args) throws NoMatchFoundException {
        HashMap<String, String> countries = new HashMap<>();
        countries.put("India", "New Delhi");
        countries.put("USA", "Washington, D.C.");
        countries.put("France", "Paris");

        String country = "Germany";
        if (countries.containsKey(country)) {
            System.out.println("Capital: " + countries.get(country));
        } else {
            throw new NoMatchFoundException("No Match Found for: " + country);
        }
    }
}

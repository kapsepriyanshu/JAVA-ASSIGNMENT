class InvalidUsernameException extends Exception {
    InvalidUsernameException(String message) {
        super(message);
    }
}

class PasswordMismatchException extends Exception {
    PasswordMismatchException(String message) {
        super(message);
    }
}

class UserValidation {
    public static void main(String[] args) {
        try {
            String username = "user1";
            String password = "password123";
            String confirmPassword = "password";

            if (username.length() < 6) {
                throw new InvalidUsernameException("Username must be at least 6 characters long.");
            }

            if (!password.equals(confirmPassword)) {
                throw new PasswordMismatchException("Passwords do not match.");
            }

            System.out.println("User validation successful!");
        } catch (InvalidUsernameException | PasswordMismatchException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

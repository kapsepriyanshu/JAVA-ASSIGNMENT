class TooOlder extends Exception {
    TooOlder(String message) {
        super(message);
    }
}

class TooYounger extends Exception {
    TooYounger(String message) {
        super(message);
    }
}

class RecruitmentSystem {
    public static void main(String[] args) {
        try {
            String name = "John";
            int age = 50;
            if (age > 45) {
                throw new TooOlder("Candidate is too old for recruitment.");
            } else if (age < 20) {
                throw new TooYounger("Candidate is too young for recruitment.");
            } else {
                System.out.println("Eligible Candidate: " + name);
            }
        } catch (TooOlder | TooYounger e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

import java.util.Scanner;

class AdmissionEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter marks for student " + i);
            System.out.print("Math: ");
            int math = scanner.nextInt();
            System.out.print("Physics: ");
            int physics = scanner.nextInt();
            System.out.print("Chemistry: ");
            int chemistry = scanner.nextInt();
            int total = math + physics + chemistry;
            if ((math >= 60 && physics >= 50 && chemistry >= 40 && total >= 200) || (math + physics >= 150)) {
                System.out.println("Student " + i + ": Eligible");
            } else {
                System.out.println("Student " + i + ": Not Eligible");
            }
        }
    }
}

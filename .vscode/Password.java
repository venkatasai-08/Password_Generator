import java.security.SecureRandom;
import java.util.Scanner;

public class Password {
    private static final String NUMBERS = "0123456789"; 
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String SYMBOLS = "<.>!@#$%^&*()?/*-/+";

    private static String generatePassword(int length) {
        String characters = CHARACTERS + NUMBERS + SYMBOLS;
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }	
        return password.toString();
    }

    private static String generateEmail(String user, String password) {
        String domain = "@gmail.com";
        return user+ domain;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the email ID:");
        String user = scanner.nextLine();
        System.out.println("Enter the length of the password:");
        int length = scanner.nextInt();

        if (user.isEmpty() || length <= 0) {
            System.out.println("Invalid input. Please provide valid username and password length.");
            return;
        }

        String password = generatePassword(length);
        String email = generateEmail(user, password);

        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
    }
}

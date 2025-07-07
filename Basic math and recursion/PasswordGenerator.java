import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {
    private static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+<>?";

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for password length
        int length = getPasswordLength(scanner);

        // Prompt the user for character types
        String characterTypes = getCharacterTypes(scanner);

        // Generate the password
        String password = generatePassword(length, characterTypes);

        // Display the result
        System.out.println("Generated Password: " + password);
    }

    private static int getPasswordLength(Scanner scanner)
    {
        int length = 0;
        while (length <= 0)
        {
            try 
            {
                System.out.print("Enter the desired length of the password: ");
                length = Integer.parseInt(scanner.nextLine());
                if (length <= 0) 
                {
                    System.out.println("Invalid password length. Please enter a value greater than 0.");
                }
            } catch (NumberFormatException e) 
            {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        return length;
    }

    private static String getCharacterTypes(Scanner scanner)
    {
        String characterTypes = "";
        while (characterTypes.isEmpty())
        {
            System.out.println("Choose the character types to include in the password:");
            System.out.println("1. Uppercase letters");
            System.out.println("2. Lowercase letters");
            System.out.println("3. Numbers");
            System.out.println("4. Symbols");
            System.out.print("Enter the numbers corresponding to the character types (comma-separated): ");

            String input = scanner.nextLine();
            if (input.isEmpty()) 
            {
                System.out.println("No character types selected. Please choose at least one character type.");
                continue;
            }

            String[] choices = input.split(",");
            for (String choice : choices)
            {
                int option = Integer.parseInt(choice.trim());
                switch (option)
                {
                    case 1:
                        characterTypes += UPPERCASE_LETTERS;
                        break;
                    case 2:
                        characterTypes += LOWERCASE_LETTERS;
                        break;
                    case 3:
                        characterTypes += NUMBERS;
                        break;
                    case 4:
                characterTypes += SYMBOLS;
                break;
                default:
             System.out.println("Invalid character type: " + option);
                }
            }

            if (characterTypes.isEmpty()) 
            { 
                System.out.println("No valid character types selected. Please choose valid character types.");
            }
        }

        return characterTypes;
    }

    private static String generatePassword(int length, String characterTypes)
    {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) 
        {
            int randomIndex = random.nextInt(characterTypes.length());
            password.append(characterTypes.charAt(randomIndex));
        }

        return password.toString();
    }
}
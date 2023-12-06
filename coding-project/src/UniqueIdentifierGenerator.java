import java.util.Random;

public class UniqueIdentifierGenerator {
    private static final Random random = new Random(123);
    public static void main(String[] args) {
        String uniqueIdentifier = generateUniqueIdentifier();
        System.out.println("Unique Identifier: " + uniqueIdentifier);
    }

    public static String generateUniqueIdentifier() {
        int randomNumber = random.nextInt(900000) + 100000;
        String uniqueIdentifier = String.valueOf(randomNumber);
        return uniqueIdentifier;
    }
}




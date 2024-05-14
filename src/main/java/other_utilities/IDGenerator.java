package other_utilities;

import java.util.Random;
/*https://www.baeldung.com/java-random-string*/
public class IDGenerator {
    private final int leftLimit = '0';
    private final int rightLimit = '9';

    public IDGenerator(){}
    public String generateClaimID(){
        Random random = new Random();
        int CLAIM_ID_NUM_LENGTH = 10;
        String newString = random.ints(leftLimit,rightLimit+1).
                limit(CLAIM_ID_NUM_LENGTH).
                collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append).toString();
        char firstCharClaimID = 'f';
        return firstCharClaimID +newString;
    }
    public String generateCustomerID(){
        Random random = new Random();
        int CUSTOMER_ID_NUM_LENGTH = 7;
        String newString = random.ints(leftLimit,rightLimit+1).
                limit(CUSTOMER_ID_NUM_LENGTH).
                collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append).toString();
        char firstCharCustomerID = 'c';
        return firstCharCustomerID +newString;
    }
    public String generateCardID(){
        Random random = new Random();
        int CARD_ID_LENGTH = 10;
        String newString = random.ints(leftLimit,rightLimit+1).
                limit(CARD_ID_LENGTH).
                collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append).toString();
        return newString;
    }
}

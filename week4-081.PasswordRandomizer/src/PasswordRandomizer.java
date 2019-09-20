import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random;
    

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        for(int i = 0; i < this.length; i++){
            password += alphabet.charAt(random.nextInt(alphabet.length()));
        }
        return password;
    }
}

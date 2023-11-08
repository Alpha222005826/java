// Define an interface for account creation
interface AccountCreation {
    void createAccount();
}

// Implement the account creation interface in the Signup class
class Signup implements AccountCreation {
    public void createAccount() {
        System.out.println("Account created in Signup class");
    }
}

// Create a class Username that extends Signup
class Username extends Signup {
    private String username;

    public void setUsername(String username) {
        this.username = username;
        System.out.println("Username set to: " + this.username);
    }

    public String getUsername() {
        return username;
    }
}

// Create a class CreatePassword that extends Username
class CreatePassword extends Username {
    private String password;

    public void setPassword(String password) {
        this.password = password;
        System.out.println("Password set to: " + this.password);
    }

    public String getPassword() {
        return password;
    }
}

// Create a class Login that extends CreatePassword
class Login extends CreatePassword {
    public void performLogin(String enteredPassword) {
        if (enteredPassword.equals(getPassword())) {
            System.out.println("Logged in successfully in Login class");
        } else {
            System.out.println("Incorrect password. Please try again.");
        }
    }
}

public class inhertance2 {
    public static void main(String[] args) {
        // Create an instance of the Login class
        Login login = new Login();

        // Call methods to create an account, set username and password
        login.createAccount();
        login.setUsername("myUsername");
        login.setPassword("myPassword");

        // Attempt to log in with a password
        login.performLogin("wrongPassword");
        login.performLogin("myPassword");
    }
}

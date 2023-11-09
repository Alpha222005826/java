// Defining an interface for accountcreation
interface AccountCreation {
    void createAccount();
}

// Implement the accountcreation interface in the class Signup 
class Signup implements AccountCreation {
    public void createAccount() {
        System.out.println("Please fill the form to create your account");
    }
}

// Creating a class Username that extends Signup
class Username extends Signup {
    private String username;

    public void setUsername(String username) {// main method

        System.out.println("Enter your Username: " +username);
    }

    public String getUsername() {
        return username;// program will return username used
    }
}

// Creating a class CreatePassword that extends Username
class CreatePassword extends Username {
    private String password;

    public void setPassword(String password) {// main method
    this.password=password; 
        System.out.println("Enter your Password:" + this.password);
         System.out.println("Account created successfully");
    }

    public String getPassword() {
       
        return password;// program will return password used
    }
}

// Create a class Login that extends CreatePassword
class Login extends CreatePassword {
    public void performLogin(int enteredPassword) { // main method
        if (enteredPassword==12345) {
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
        login.setUsername("MR David KABAMBA");
        login.setPassword("1234");

    
    }
}


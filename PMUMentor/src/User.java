import java.util.HashSet;
import java.util.Scanner;

public class User {
    String name;
    String email;
    String password;
    String phoneNumber;
    static User currentUser = null;
    static HashSet<Mentor> mentors = new HashSet<>();
    static HashSet<Mentee> mentees = new HashSet<>();
    static Scanner input = new Scanner(System.in);
    public User(String name, String email, String password, String phoneNumber){
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        while (true) {
            printMainMenu();
            int userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    createAccountRequest();
                    break;
                case 2:
                    loginRequest();
                    break;
                case 3:
                    changePasswordRequest();
                    break;
                default:
                    System.out.println("Input is invalid.");
                    break;
            }
        }
    }
    public static void createAccountRequest(){
        System.out.println("Do you have an account? (Y/N):");
        if (input.next().equalsIgnoreCase("Y")){
            loginRequest();
        }
        System.out.println("Please enter your PMU e-mail: ");
        String email = input.next();

        System.out.println("Please enter you password: ");
        String password = input.next();

        System.out.println("Please enter your name: ");
        String name = input.next();

        System.out.println("Please enter your phone number: ");
        String phoneNumber = input.next();

        System.out.println("Do you want to be a mentor? (Y/N):");
        String role = input.next();

        boolean newAccount = createAccount(email, password, name, phoneNumber, role);
        if (newAccount){
            System.out.println("Account created successfully.");
        }
        else {
            System.out.println("Account creation failed. Email already exist.");
        }
    }

    public static boolean createAccount(String email, String password, String name, String phoneNumber, String role){
        for (Mentor user: mentors){
            if (user.getEmail().equalsIgnoreCase(email))
                return false;
        }

        for (Mentee user: mentees){
            if (user.getEmail().equalsIgnoreCase(email)){
                return false;
            }
        }

        if (role.equalsIgnoreCase("Y")){
            Mentor newAccount;
            newAccount = new Mentor(name, email, password, phoneNumber);
            mentors.add(newAccount);
        }
        else {
            Mentee newAccount;
            newAccount = new Mentee(name, email, password, phoneNumber);
            mentees.add(newAccount);
        }
        return true;
    }

    public static void loginRequest(){
        System.out.println("Please enter your PMU e-mail: ");
        String email = input.next();

        System.out.println("Please enter you password: ");
        String password = input.next();

        boolean loginState = login(email, password);

        if (loginState){
            System.out.println("Login successful. Welcome");
            System.out.println(currentUser);
        }
        else {
            System.out.println("Email or Password is incorrect");
        }
    }
    public static boolean login(String email, String password){
        for (Mentor user: mentors){
            if (user.getEmail().equalsIgnoreCase(email) && user.getPassword().equalsIgnoreCase(password)){
                currentUser = user;
                return true;
            }
        }

        for (Mentee user: mentees){
            if (user.getEmail().equalsIgnoreCase(email) && user.getPassword().equalsIgnoreCase(password)){
                currentUser = user;
                return true;
            }
        }
        return false;
    }
    public static void changePasswordRequest(){
        if (currentUser == null){
            System.out.println("You are not logged in . Please enter you email address: ");
            String email = input.next();
            for (Mentor user: mentors){
                if (user.getEmail().equalsIgnoreCase(email))
                    currentUser = user;
            }

            for (Mentee user: mentees){
                if (user.getEmail().equalsIgnoreCase(email)){
                    currentUser = user;
                }
            }
        }
        if (currentUser == null){
            System.out.println("Account is not fount.");
            return;
        }
        System.out.println("Please enter your new password: ");
        changePassword(input.next());
    }
    public static void changePassword(String password){
        currentUser.setPassword(password);
        System.out.println("Password have been successfully changed.");
    }
    public static void printMainMenu(){
        System.out.println("Login or Register");
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

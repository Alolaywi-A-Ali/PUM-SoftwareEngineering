import java.util.Scanner;

public class User {
    String name;
    String email;
    String password;
    String phoneNumber;
    static Scanner input = new Scanner(System.in);
    public User(String name, String email, String password, String phoneNumber){
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {

    }
    public void createAccountRequest(){
        boolean isUser = false;
        System.out.println("Do you have an account? (Y/S):");
        if (input.next().equalsIgnoreCase("Y")){
            isUser = true;
        }
        System.out.println("Please enter your PMU e-mail: ");
        String email = input.next();

        System.out.println("Please enter you password: ");
        String password = input.next();
    }

    public static boolean createAccount(){

    }
    public static boolean login(){

    }
    public static void changePasswordRequest(){

    }
    public static boolean changePassword(){

    }
    public static void printMainMenu(){

    }
}

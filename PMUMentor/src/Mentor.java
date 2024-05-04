public class Mentor extends User{
    String major;
    public Mentor(String name, String email, String phoneNumber, String major){
        super(name, email, phoneNumber);
        this.major = major;
    }
}

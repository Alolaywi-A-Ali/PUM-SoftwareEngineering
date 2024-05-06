public class Mentor extends User{
    String major;
    public Mentor(String name, String email, String password, String phoneNumber, String major){
        super(name, email, password, phoneNumber);
        this.major = major;
    }
    @Override
    public String toString() {
        return "Mentor{" +
                "major='" + major + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

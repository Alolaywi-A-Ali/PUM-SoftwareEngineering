import java.util.HashSet;

public class Mentee extends User{
    HashSet<Mentor> mentors = new HashSet<>();
    public Mentee(String name, String email, String password, String phoneNumber, HashSet<Mentor> mentors){
        super(name, email, password, phoneNumber);
        this.mentors = mentors;
    }

    @Override
    public String toString() {
        return "Mentee{" +
                "mentors=" + mentors +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

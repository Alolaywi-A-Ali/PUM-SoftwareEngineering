import java.util.HashSet;

public class Mentee extends User{
    static HashSet<Mentor> mentors = new HashSet<>();
    public Mentee(String name, String email, String password, String phoneNumber){
        super(name, email, password, phoneNumber);
    }
    public static void addMentor(Mentor mentor){
        mentors.add(mentor);
        System.out.println("You added "+mentor.getName()+" successfully.");
    }
    public static void startChat(){
        //add logic
    }
    public static void scheduleMeeting(){
        //add logic
    }

    public static void removeMentor(Mentor mentor){
        mentors.remove(mentor);
        System.out.println("You removed "+mentor.getName()+" successfully.");
    }
}

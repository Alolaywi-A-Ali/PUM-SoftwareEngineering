import java.util.HashSet;

public class Mentor extends User{
    String major;
    static HashSet<Mentee> mentees = new HashSet<>();
    public Mentor(String name, String email, String password, String phoneNumber){
        super(name, email, password, phoneNumber);
    }
    public static void sendStudyGide(){
        System.out.println("Your study guide.");
    }
    public static void addMentee(Mentee mentee){
        mentees.add(mentee);
        System.out.println("You added "+mentee.getName()+" successfully.");
    }
    public static void scheduleMeeting(){
        //add logic
    }

    public static void removeMentee(Mentee mentee){
        mentees.remove(mentee);
        System.out.println("You removed "+mentee.getName()+" successfully.");
    }
}

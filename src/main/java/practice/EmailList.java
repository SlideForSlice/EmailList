package practice;

//For TreeSet
import java.util.Iterator;
import java.util.TreeSet;

//JavaMail API
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;


public class EmailList {

    private TreeSet<String> set;

    public EmailList(){
        this.set = new TreeSet<>();
    }

    //Validation email
    public static boolean isValidEmailAddress(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }

    //Adding email in TreeSet
    public boolean ADD(String email) {

        if (isValidEmailAddress(email)) {
            set.add(email);
            System.out.println("Your email was added\n");
            return true;
        } else {
            System.out.println("Invalid email\n");
            return false;
        }
    }

    //Print email list
    public boolean LIST(){
        Iterator<String> itr = set.iterator();
        if (set.isEmpty()){
            System.out.println("The List is empty");
            return false;
        }
        else {
            System.out.println("Email List:");
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
            return true;
        }

    }


}

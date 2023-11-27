package practice;

import java.util.TreeSet;

public class EmaiList {

    private TreeSet<String> set;

    public EmaiList(){
        this.set = new TreeSet<>();
    }

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

    public void ADD(String email){
        if
    }


}

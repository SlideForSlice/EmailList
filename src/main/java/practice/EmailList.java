package practice;

//For TreeSet
import java.util.Iterator;
import java.util.TreeSet;

//For Regex
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {

    //Regex for validation email
    private static final String REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
    private TreeSet<String> set;

    public EmailList(){

        this.set = new TreeSet<>();
    }


    //Validation email before adding in TreeSet
    public void ADD(String email){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches()){
            set.add(email);
            System.out.println("Your email was added");
        }
        else {
            System.out.println("Invalid email");
        }
    }

    //Print emails as much as have in TreeSet
    public void LIST(){
        Iterator<String> itr = set.iterator();
        System.out.println("Emaiiiiiiiiiiils:");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        EmailList list = new EmailList();

        list.ADD("ssdfhiuh@gmail.com");
        list.ADD("12344123!!!!!@ya.ru");
        list.ADD("invalid@dick.shu");
        list.ADD("Inddsfs.com");
        list.LIST();

    }



}

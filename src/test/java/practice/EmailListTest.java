package practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class EmailListTest {


    @Test
    void addInvalidEmail(){

        EmailList newList = new EmailList();
        Assertions.assertFalse(newList.ADD("asdasdasd"));;
    }

    @Test
    void addValidEmail(){

        EmailList newList = new EmailList();
        Assertions.assertTrue(newList.ADD("soska23@ya.ru"));
    }

    @Test
    void printEmptyList(){


        EmailList newList = new EmailList();
        Assertions.assertFalse(newList.LIST());

    }

    @Test
    void printNotEmptyList(){


        EmailList newList = new EmailList();

        newList.ADD("asdasdasd");
        newList.ADD("stwer.@gsdfsdf.ru");
        newList.ADD("duhidsfiudfisd3123123113123@gmail.com");
        newList.ADD("12736!@#^$(dgsa@ya.ru");

        Assertions.assertTrue(newList.LIST());
    }


}
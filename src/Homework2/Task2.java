package Homework2;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {

        String[] emails = new String[8];

        emails[0] = "user@domain.com";
        emails[1] = "user@domain.co.in";
        emails[2] = "user1@domain.com";
        emails[3] = "user.name@domain.com";
        emails[4] = "user#@domain.co.in";
        emails[5] = "user@domaincom";
        emails[6] = "user#domain.com";
        emails[7] = ("@yahoo.com");


        String text = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(text);

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " : " + matcher.matches());
        }
    }

}

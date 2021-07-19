package String;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

//Write a Java program to print current date and time in the specified format.
public class s15 {
    public static void main(String[] args) throws ParseException {


        Date date = new Date();
        SimpleDateFormat spf=new SimpleDateFormat();
        spf.applyPattern("MM-dd-yyyy hh:mm");
        String spfDate=spf.format(date.getTime());
        Date parseDate=spf.parse(spfDate);
        System.out.println(parseDate);
        System.out.println("-----------");


        System.out.println("Current Date and Time :  ");
        System.out.println(spf.format(date.getTime()));
//        System.out.println(spf.format(date.getTime()));

    }
}

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTime{
    public static void main(String[] args){
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj);
        LocalTime myObj2 = LocalTime.now();
        System.out.println(myObj2);
        LocalDateTime myObj3 = LocalDateTime.now();
        System.out.println(myObj3);
        
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
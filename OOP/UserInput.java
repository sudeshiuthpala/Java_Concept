import java.util.Scanner;
public class UserInput{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter User Name : ");
        String username=obj.nextLine();
        System.out.println("User Name : "+username); 
    }
}
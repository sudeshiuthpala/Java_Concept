import java.util.Scanner;
class InputArray{
    public static void main(String[] args){
        int[] marks= new int[10];
        for(int i=0;i<10;i++){
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter number : ");
            marks[i]=obj.nextInt();
            System.out.println("marks"+"["+i+"]="+marks[i]);
        }
    }
}
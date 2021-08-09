public class StringFun{
    public static void main(String[] args){
        String greeting="Hello world";
        //string length
        System.out.println(greeting.length());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());
        //find a character
        System.out.println(greeting.indexOf("r"));
        //string concatension
        String firstname="John";
        String lastname="Doe";
        System.out.println(firstname+" "+lastname);
        System.out.println(firstname.concat(lastname));
        System.out.println(Math.max(5,10));

    }
}
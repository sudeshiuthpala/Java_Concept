public class Person{
    String fname;
    String lname;
    int age;
    public Person(String fname,String lname,int age){
        this.fname=fname;
        this.lname=lname;
        this.age=age;
    }
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    public void older(int age){
        if(age>60){
            System.out.println("She is elder than 60 years");
        }
        else{
            System.out.println("She is younger than 60 years"); 
        }
    }
    public static void main(String[] args){
        Person obj1=new Person("Lalith","perera",25);
        System.out.println("Name : "+obj1.fname+" "+obj1.lname);
        System.out.println("Age : "+obj1.age);
        myStaticMethod();
        obj1.myPublicMethod();
        obj1.older(obj1.age);
    }
}
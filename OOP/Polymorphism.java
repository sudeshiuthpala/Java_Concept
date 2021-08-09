class Animal{
    public  void sound(){
        System.out.println("The animal makes a sound");
    }
}
class Pig extends Animal{
    public  void sound(){
        System.out.println("Wee-wee");
    }
}
class Dog extends Animal{
    public  void sound(){
        System.out.println("Baw - baw");
    }
}

public class Polymorphism{
    public static void main(String[] args){
        Animal animal=new Animal();
        Animal pig=new Pig();
        Animal dog=new Dog();
        animal.sound();
        pig.sound();
        dog.sound();
    }
}
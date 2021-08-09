public class Final{
    final int x=10;
    final double PI=3.14;

    public static void main(String[] args){
        Final myobj=new Final();
        myobj.x=50;
        myobj.PI=25;
        System.out.println(myobj.x);
    }
}
// Final.java:7: error: cannot assign a value to final variable x
//         myobj.x=50;
//              ^
// Final.java:8: error: cannot assign a value to final variable PI
//         myobj.PI=25;
//              ^
// 2 errors
public class Gcd{
    public static void main(String[] args){
        int n=366;
        int r=60;
        int result=gcd(n,r);
        System.out.println(result);
    }
    public static int gcd(int a,int b){
        if(b!=0){
            return gcd(b,a%b);
        }else{
            return a;
        }
    }
}
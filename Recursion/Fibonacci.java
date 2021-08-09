public class Fibonacci{
    public static void main(String[] args){
        int n=0;
        while(n<5){
            System.out.println(fib(n));
            n++;
        }
    }
    public static int fib(int k){
        if(k==0){
            return 0;
        }else if(k==1){
            return 1;
        }else{
            return fib(k-1)+fib(k-2);
        }
    }
}
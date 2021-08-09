public class Factorial{
    public static void main(String[] args){
        int result=fac(5);
        System.out.println(result);
    }
    public static int fac(int k){
        if(k==0){
            return 1;
        }else if(k==1){
            return 1;
        }else if(k>1){
            return k*fac(k-1);
        }else{
            return 0;
        }
    }
}
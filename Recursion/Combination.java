public class Combination{
    public static void main(String[] args){
        int n=5;
        int r=2;
        int result=ncr(n,r);
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
    public static int ncr(int n,int r){
        if(n==0){
            return 1;
        }else{
            return fac(n)/(fac(r) * fac(n-r));
        }
    }
}
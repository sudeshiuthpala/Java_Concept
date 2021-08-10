class CopyArray{

    static void mean(int[] array){
        int total=0;
        for(int i=0;i<5;i++){
            total=total+array[i];
        }
        int avg=total/5;
        System.out.println(avg);
    }
    static void small(int[] array){
        int smallest=array[0];
        for(int i=1;i<4;i++){
            if(array[i]<smallest){
                smallest=array[i];
            }
        }
        System.out.println(smallest);
    }
    static void secLargest(int[] array){
        int temp;
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(array[3]);
    }
    static void isDuplicate(int[] array){
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(array[i]==array[j]){
                    System.out.println("yes");
                }
            }
        }
    }
    static void insertData(int[] array,int pos,int data,int n){
        int I=n-1;
        while(I>=pos){
            array[I+1]=array[I];
            I=I-1;
        }
        array[pos]=data;
        n=n+1;
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }
    static void delete(int[] array,int pos,int n){
        int I=pos;
        while(I<=n-1){
            array[I]=array[I+1];
            I=I+1;
        }
        n=n-1;
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }
    static void merge(int[] array,int[] array2,int n,int m){
        int x=n+m;
        int[] array3=new int[x];
        for(int i=0;i<n;i++){
            array3[i]=array[i];
        }
        for(int j=0;j<m;j++){
            array3[n+j]=array2[j];
        }
        for(int i=0;i<x;i++){
            System.out.println(array3[i]);
        }
    }

    public static void main(String[] args){
        int[] array2= new int[10];
        int[] array1 = {6,6,6,4,5};
        for(int i=0;i<5;i++){
            array2[i]=array1[i];
        }
        for(int i=0;i<5;i++){
            System.out.println(array2[i]);
        }
        mean(array2);
        small(array2);
        //secLargest(array2);
        isDuplicate(array2);
        //insertData(array2,2,10,5);
        //delete(array2,2,6);
        merge(array1,array2,5,5);
    }
}
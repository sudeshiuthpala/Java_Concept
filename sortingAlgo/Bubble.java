public class Bubble{
    static void bubbleSort(int[] array){
        int i,j,temp;
        for(i=0;i<array.length-1;i++){
            for(j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int[] array={23,56,12,63,97,2};
        bubbleSort(array);
    }
}
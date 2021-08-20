public class Insertion{
    static void insertionSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            int temp=array[i];
            int j;
            for(j=i;j>0 && temp<array[j-1];j--){
                array[j]=array[j-1];
            }
            array[j]=temp;
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int[] array={23,56,12,63,97};
        insertionSort(array);
    }
}
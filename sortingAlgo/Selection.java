public class Selection{
    static void selectionSort(int[] array){
        int i,j,temp,min_idx;
        for(i=0;i<array.length-1;i++){
            min_idx=i;
            for(j=i+1;j<array.length;j++){
                if(array[j]<array[min_idx]){
                    min_idx=j;
                }
            }
            temp=array[min_idx];
            array[min_idx]=array[i];
            array[i]=temp;
        }
        for(i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int[] array={23,56,12,63,97,2};
        selectionSort(array);
    }
}
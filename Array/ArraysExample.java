public class ArraysExample{
    public static void main(String[] args){
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // //access element in array
        // System.out.println(cars[0]);
        // //change an array element
        // cars[1]="Opel";
        // for (String i : cars) {
        //     System.out.println(i);
        // }
        // //array length
        // System.out.println(cars.length);
        //Multidimentional array
        int[][] myNumbers={{1,2,3},{4,5,6}};
        int x=myNumbers[1][2];
        System.out.println(x);
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
              System.out.println(myNumbers[i][j]);
            }
          }
    }
}
class BubbleSort{
    static void bubbleSort(int[] arrayNumber){
        int n = arrayNumber.length;
        int temp;
        for (int i = 0; i < n; i++){
            for (int j = 1; j < (n - i); j++){
                if (arrayNumber[j-1] > arrayNumber[j]){
                    temp = arrayNumber[j-1];
                    arrayNumber[j-1] = arrayNumber[j];
                    arrayNumber[j] = temp;
                }
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {

        int[] arrayVariable = {10, 50, 110, 90, 1, 9, 200, 4, 2000};
        System.out.println("This is the Array values before Sorting");
        for (int j : arrayVariable) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Sorting the elements using Bubble Sorting Algorithm
        BubbleSort.bubbleSort(arrayVariable);
        System.out.println("This is the value of the Array after Sorting");
        for (int j : arrayVariable) {
            System.out.print(j + " ");
        }
    }
}
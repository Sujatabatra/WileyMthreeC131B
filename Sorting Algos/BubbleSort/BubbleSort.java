import java.util.ArrayList;

public class BubbleSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> array){
        int size = array.size();
        System.out.println(array);

        for (int i = 0; i < size - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < size - i - 1; j++){
                if (array.get(j) > array.get(j + 1)) {
                    System.out.println("Before Swapping Array: " + array);
                    System.out.println("Swapping "  + array.get(j) + " and " + array.get(j + 1));
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set((j + 1), temp);
                    swapped = true;
                    System.out.println("After Swapping Array: " + array);

                }
            }
            if(!swapped) break;
            System.out.println("------------------------------------------------");
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println("Sorted Array: "+ BubbleSort.sort(Input.getInput()));
    }
}


/*
1. Time Complexities
Worst Case Complexity: O(n2)
If we want to sort in ascending order and the array is in descending order then the worst case occurs.
Best Case Complexity: O(n)
If the array is already sorted, then there is no need for sorting.
Average Case Complexity: O(n2)
It occurs when the elements of the array are in jumbled order (neither ascending nor descending).
2. Space Complexity
Space complexity is O(1) because an extra variable is used for swapping.
In the optimized bubble sort algorithm, two extra variables are used. Hence, the space complexity will be O(2).
*/
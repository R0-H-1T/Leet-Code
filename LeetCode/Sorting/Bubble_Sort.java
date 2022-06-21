// Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements 
// if they are in the wrong order. This algorithm is not suitable 
// for large data sets as its average and worst case time complexity is quite high.


class Sort1 {
    public void bubbleSort(int[] arr){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){ // in each iteration of j
                if(arr[j] > arr[j+1]){  // the greatest of all nums in array is shifted to last position
                    int temp = arr[j]; // therefore leaving out nums at index -> n-i-1
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public void printArray(int[] arr){
        for(int n:arr) System.out.print(n+" ");
    }
}

public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 90,  11};
        Sort1 b = new Sort1();
        b.bubbleSort(arr);
        b.printArray(arr);
    }
}
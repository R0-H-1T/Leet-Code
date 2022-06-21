class Sort1 {
    
    public void selectionSort(int[] arr){
        int n =arr.length;
        for(int i=0;i <n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void printArray(int[] arr){
        for(int n:arr)    System.out.print(n+" ");
        
    }

}

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {12,5,11,90,22,1};
        Sort1 s = new Sort1();
        s.selectionSort(arr);
        s.printArray(arr);
    }
}

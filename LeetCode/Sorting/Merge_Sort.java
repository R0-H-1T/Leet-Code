class Merge_Sort{
    public void mergeSort(int[] arr, int l, int r){
        
    }
    public static void sort(int[] arr, int l, int r){
        if(l<r){
            
            int mid = (l+r)/2;
            sort(arr, l, mid);
            sort(arr, mid+1, r);
        }

    }
    public void printArray(int[] arr){

    }
    public static void main(String[] args) {
        int[] nums = {12,11,7,5,6};
        sort(nums, 0, nums.length-1);
    }
}




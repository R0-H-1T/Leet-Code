import java.lang.reflect.Array;
import java.util.Arrays;

class Merge_Sort{
    public static int[] sort(int[] arr){
        if(arr.length == 1) return arr;

        int mid = arr.length/2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    public static int[] merge(int[] first, int[] second){
        int[] newArr = new int[first.length + second.length];
        int i=0, j=0, k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]) newArr[k] = first[i++];
            else newArr[k] = second[j++];
            k++;
        }
        while(i<first.length) newArr[k++] = first[i++];
        while(j<second.length) newArr[k++] = second[j++];

        return newArr;
    }
    public static void main(String[] args) {
        int[] nums = {12,11,7,5,6};
        nums  = sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}




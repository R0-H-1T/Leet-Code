public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target) return mid;
            else if(target<nums[mid]) high = mid-1;
            else low=mid+1;
        }
        return low;
        
        
        
        /*if(target<nums[0]) return 0;
        if(target>nums[nums.length-1]) return nums.length;
        for(int i=0; i<nums.length; i++){
             if(target == nums[i]) return i;
             if(target>nums[i] && target<nums[i+1]) return i+1;
         }
        return 0;*/
    }
}

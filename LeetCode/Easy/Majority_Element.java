import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
    public static int majorityElement1(int[] nums){
        Map<Integer, Integer> hs = new HashMap<Integer,Integer>();
        int num = 0;
        for(int n: nums){
            if(!hs.containsKey(n)) hs.put(n, 1);
            else hs.put(n, hs.get(n)+1);

            if(hs.get(n) > nums.length/2){
                num = n; break;
            }
        }
        return num;

        //Moore voting
        // int count=0, ret = 0;
        // for (int num: nums) {
        //     if (count==0)
        //         ret = num;
        //     if (num!=ret)
        //         count--;
        //     else
        //         count++;
        // }
        // return ret;

        //sorting
        // Arrays.sort(nums);
        // return nums[nums.length/2];
    }
}

public class Single_Number{
    public int singleNumber(int[] nums) {
        //XOR Bitwise operator
        //0 ^ N = N
        //N ^ N = 0
        int res=0;
        for(int n:nums){
            res^=n;
        }
        return res;        
    } 
}

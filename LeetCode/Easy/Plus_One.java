
//[1,2,3] => [1,2,4]
//[1,2,9] => [1,3,0]


public class Plus_One {
    public int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0; 
        }
        
        int newNumber[] = new int[digits.length+1];
        newNumber[0]=1;
        return newNumber;
    } 
}

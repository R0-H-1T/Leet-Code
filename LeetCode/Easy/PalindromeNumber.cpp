public class PalindromeNumber {
    
    boolean isPalindrome(int x){
        int reverse=0,r,og;
        og=x;
        if(x==0) return true;
        if(x < 0 || x%10 == 0) return false;

        while(x>reverse){
            r=x%10;
            x/=10;
            reverse= (reverse*10) +r;
        }
        if(x==reverse || x== reverse/10) return true;
        else return false;
    }
    
}

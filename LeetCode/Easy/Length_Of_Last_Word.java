public class Length_Of_Last_Word {
    private static int lengthOfLastWord(String s){
        int len=s.length(), lastLength=0;
    
        while(len > 0 && s.charAt(len-1)==' '){
            len--;
        }
        
        while(len > 0 && s.charAt(len-1)!=' '){
            lastLength++;
            len--;
        }
        return lastLength;
    }
    public static void main(String[] args) {
        String s = "hello world";
        int len  = lengthOfLastWord(s);
        System.out.println(len);
    }
}

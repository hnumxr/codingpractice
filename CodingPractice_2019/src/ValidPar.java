public class ValidPar {

    // Check if the string is palindrome.
    public boolean ValidPalindrome(String s){
        int l = s.length();
        if(l==0)
            return false;

        //Check
        for(int i=0; i<= l / 2; i++){
            if(s.charAt(i) != s.charAt(l-1-i))
                return false;
        }

        return true;
    }
}

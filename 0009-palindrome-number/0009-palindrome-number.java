class Solution {
    public boolean isPalindrome(int x) {
        int number;
        String resultPalindrome = "";
        
         if(x < 0){
            return false;
         } else {
            if(x == 0){
                return true;
            }
         }
        number = x;
        while( x != 0){
          resultPalindrome += x % 10;
          x = x /10;
        }

        if(resultPalindrome.equals(number + "")){
            return true;
        } 
        return false;
    }
}
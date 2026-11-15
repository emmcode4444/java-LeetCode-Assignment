package Easy;
// leet code 9th problem Solution : Palindrome Number 


class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int n =x;
        int reverseNumber = 0;

        while(n>0){
            int lastDigit= n%10;
            reverseNumber = reverseNumber*10+lastDigit;

            n = n/10;

        }
        if(reverseNumber == x){
            return true;
        }
        else{
            return false;
        }

    }
}

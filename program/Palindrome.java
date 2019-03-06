public class Palindrome {
    public static void main(String []args){
        Palindrome palindrome = new Palindrome();
        palindrome.findPalindrome("madam");
        palindrome.findPalindrome("sagar");
    }
    public void findPalindrome(String str){
       int j = str.length()-1;
       int flag =0;
       for(int i = 0; i<str.length()/2; i++){
           if(str.charAt(i)!= (str.charAt(j))){
               flag =1;
               System.out.println("String " +str+" is not palindrome");
           }
           j--;
       }
        if(flag ==0){
            System.out.println("String " +str+" is palindrome");
        }
    }
}

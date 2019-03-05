public class ReverseSentence {
    public static void main(String [] args){
        ReverseSentence ReverseSentence = new ReverseSentence();
        String str = "I am Sagar Dere";
        ReverseSentence.reverseString(str);
    }

    private void reverseString(String str) {
        String reverseString = "";
        String currentString = "";
        for(int i = 0; i< str.length();i++){
            if(str.charAt(i) == ' '){
                reverseString = str.charAt(i)+currentString+reverseString;
                currentString = "";
            }else{
                currentString = currentString+ str.charAt(i);
            }
        }
        reverseString = currentString +' '+ reverseString;

        System.out.println(reverseString);
    }
}

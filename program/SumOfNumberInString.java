public class SumOfNumberInString {
    public static void main(String []args){
        SumOfNumberInString sumOfNumberInString = new SumOfNumberInString();
        sumOfNumberInString.sumOfNumber("s2fd3gh6kh9");
    }
    public void sumOfNumber(String str){
        int sum= 0;
       for(int i = 0; i <str.length(); i++){
           if(str.charAt(i)> '1' && str.charAt(i)<= '9') {
               sum = sum + Integer.parseInt(str.charAt(i)+"");
           }
       }
       System.out.println("Sum of String number is = "+sum);
    }
}

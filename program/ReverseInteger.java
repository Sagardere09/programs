public class ReverseInteger {
    public static void main(String [] args){
        ReverseInteger reverseInteger = new ReverseInteger();
        reverseInteger.reverseNumber(123456);
    }

    private void reverseNumber(int num) {
        int reverseNo= 0;
       while(num > 0){
           int rem = num % 10;
           reverseNo = reverseNo *10 + rem;
           num = num/10;
       }
        System.out.print("Reverse Number is = "+reverseNo);
    }
}

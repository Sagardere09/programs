public class NumberToWords {
    public String [] roundWords = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty","Seventy","Eighty", "Ninty", "Hundred", "Thousand"};
    public String [] words = {"", "One", "Two", "Three","Four","Five","Six", "Seven","Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen","Seventeen", "Eighteen", "Ninteen"};
    public String [] centuries = {"", "one", "Ten", "Hundred", "Thousand"};
    public static void main(String [] args){
      NumberToWords numberToWords = new NumberToWords();
      int num = 3333;
      numberToWords.convert(num);
    }

    private void convert(int num) {
        String wordsStr = "";
        int digit = 0;
        while(num > 0) {
            int rem = num % 10;
            digit++;
            if(digit == 2 && rem >0){
                wordsStr = roundWords[rem]  +" "+ wordsStr;
            }else if(digit >= 3 && digit <= 4 && rem >0) {
                wordsStr = words[rem]  +" "+ centuries[digit] +" "+  wordsStr;
            }
            else{
                wordsStr =  words[rem] +" "+ wordsStr;
            }
            num = num / 10;
        }
        System.out.println(wordsStr);
    }
}

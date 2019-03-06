public class NumberToWords {
    public String wordsStr = "";
    public String [] roundWords = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty","Seventy","Eighty", "Ninty", "Hundred", "Thousand"};
    public String [] words = {"", "One", "Two", "Three","Four","Five","Six", "Seven","Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen","Seventeen", "Eighteen", "Ninteen"};
    public String [] centuries = {"", "", "", "Hundred", "Thousand",  "Lakhs" };
    public static void main(String [] args){
      NumberToWords numberToWords = new NumberToWords();
      int num =189456;
      numberToWords.convert(num);
    }

    private void convert(int num) {
        int num1 = 0 ;
        String str = "";
        int count = 0;
        int count1 = 0;
        int digit = 0;
        while(num > 0) {
            int rem = num % 10;
            digit++;
            if(digit == 2 && rem >0){
                wordsStr = roundWords[rem]  +" "+ wordsStr;
            }else if(digit >= 3 && digit < 4 && rem >0 ) {
                wordsStr = words[rem]  +" "+ centuries[digit] +" "+  wordsStr;
            }else if(digit >= 4 && num >0) {
                count++;
                str =  rem + str;
                if(count == 2 || num < 9){
                    count1++;
                    abouveThousand(Integer.parseInt(str), count1);
                    str = "";
                    count = 0;
                }
            }
            else{
                wordsStr =  words[rem] +" "+ wordsStr;
            }
            num = num / 10;
        }
        System.out.println(wordsStr);
    }

    public String abouveThousand(int num, int centurinum){
        int digit = 0;
        if(num > 20 || centurinum > 1) {
            while(num > 0) {
                int rem = num % 10;
                digit++;
                if(digit == 2 && rem >0){
                    wordsStr = roundWords[rem]  +" "+ wordsStr;
                }else if(digit >= 3 && digit < 4 && rem >0 || centurinum ==2) {
                    wordsStr = words[rem]  +" "+ centuries[centurinum + 3] +" "+  wordsStr;
                }
                else{
                    wordsStr =  words[rem] +" "+ centuries[centurinum + 3] +" "+ wordsStr;
                }
                num = num / 10;
            }
        }else{
            wordsStr = words[num] + " " + wordsStr;
        }
        return wordsStr;
    }
}

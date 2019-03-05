import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfphoneNumber {
    Map<Integer, String> phonemap = new HashMap<>();
    public static void main(String [] args){
        LetterCombinationOfphoneNumber letterCombinationOfphoneNumber = new LetterCombinationOfphoneNumber();
        letterCombinationOfphoneNumber.fillMap();
        letterCombinationOfphoneNumber.combination(23);

    }

    private void combination(int num) {
        int rem = 0, digit = 0;
        String str1 = "", str2 = "";
        while (num > 0) {
            digit++;
            rem = num % 10;
            num = num / 10;
            for (Map.Entry<Integer,String> entry : phonemap.entrySet()){

                if(entry.getKey() == rem && digit == 1){
                    str1 = entry.getValue();
                }else if (entry.getKey() == rem && digit == 2){
                    str2 = entry.getValue();
                }
        }
    }
    List<String> combinationList = new ArrayList<>();
    for(int i = 0 ; i< 3; i++){
            for(int j = 0 ; j< 3; j++){
               combinationList.add(""+str1.charAt(i)+str2.charAt(j));
            }
    }
        System.out.println(combinationList);
    }

    public void fillMap(){
        phonemap.put(2, "abc");
        phonemap.put(3, "def");
        phonemap.put(4, "ghi");
        phonemap.put(5, "jkl");
        phonemap.put(6, "mno");
        phonemap.put(7, "pqrs");
        phonemap.put(8, "tuv");
        phonemap.put(9, "wxyz");
    }

}

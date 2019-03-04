import java.util.HashMap;
import java.util.Map;

public class Longest_substring {
    public static  String str = "bbbbb";
    public static void main(String [] args){
        Longest_substring longest_substring = new Longest_substring();
        longest_substring.lengthOfLongestSubstring(str);

    }
    public void lengthOfLongestSubstring(String str) {
        int  prevPos = 0, currPos = 0;
        String prevStr = "", currStr = "";
        char prevChar = ' ';
        HashMap<Integer, Character> characterHashMap = new HashMap<>();
        for(int i = 0; i<str.length();i++){

            currPos = i;
            int pos = currPos - prevPos;
            if (str.charAt(i) > prevChar  && pos ==1 || pos ==0) {
                currStr = currStr + str.charAt(i);
                prevPos = currPos;
                prevChar = str.charAt(i);

            }else{
                if(prevStr.length() < currStr.length()){
                    prevStr =  currStr;
                }
                prevChar = ' ' ;
                prevPos = currPos;
                currStr = ""+ str.charAt(i);
            }
        }
        if(prevStr.length() < currStr.length()){
            prevStr = currStr;
        }

        System.out.println("String is = "+prevStr +" length is = "+prevStr.length());
    }

}


public class two_number_sum {

        public static void main(String [] args){
            int sum = 6;
            two_number_sum.sum_of_number(sum);
        }

    private static void sum_of_number(int sum) {
        int [] num ={1, 3, 5, 7};
        int actualSum= 0; int flag = 0;
        for(int i =0; i<num.length; i++){
            for(int j =0; j<num.length; j++){
                actualSum = num[i]+num[j];
                if(actualSum == sum && i != j){
                    flag = 1;
                   System.out.println("position of number is = ["+i+"] ["+j+"]");
                }
            }
        }
        if(flag == 0){
            flag = 0;
            System.out.println("position of number not found ");
        }

    }

}

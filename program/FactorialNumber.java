public class FactorialNumber {
    public static void main(String []args){
        FactorialNumber factorialNumber = new FactorialNumber();
        factorialNumber.factorial(5);
    }

    private void factorial(int num) {
        int fact = 1;
        for(int i = 1; i<= num;i++){
            fact = fact * i;
        }
        System.out.println("Factorial Number is = "+fact);
    }
}

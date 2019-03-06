public class FibonnaceSeries {
    public static void main(String []args){
        FibonnaceSeries fibonnaceSeries = new FibonnaceSeries();
        fibonnaceSeries.fibonnace(5);
    }

    private void fibonnace(int num) {
        int prevnum = 0;
        int currnum = 1;
        int fib =0;
        System.out.print("0, 1,");
        for(int i = 1; i<= num; i++){
            fib = prevnum + currnum;
            System.out.print(fib+",");
            prevnum = currnum;
            currnum = fib;

        }

    }
}

public class Median {
    public static void main(String [] args){
        Median median = new Median();
        float[] num1 = {1, 2};
        float[] num2 = {3, 4};
        Median.findOutMedian(num1, num2);
    }

    private static void findOutMedian(float[] num1, float[] num2) {
        float sum = 0; float mid = 0.0f;
        for(float i : num1){
            sum = sum + i;
        }
        for(float j : num2){
            sum = sum + j;
        }
        mid = sum /(num1.length + num2.length);
        System.out.println("Median is = "+mid);
    }
}

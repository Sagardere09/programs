public class LagestAndSecondLargeNo {
    public static void main(String [] args){
        int [] arr = {1,8,6,2,5,4,8,3,7};
        LagestAndSecondLargeNo lagestAndSecondLargeNo = new LagestAndSecondLargeNo();
        lagestAndSecondLargeNo.maxArea(arr);
    }

    public void maxArea(int[] arr) {
        int max = arr[0];
        int secondMax = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(secondMax < arr[i]){
                if(max < arr[i]) {
                    secondMax = max;
                    max = arr[i];
                }else if(max != arr[i]){
                    secondMax = arr[i];
                }
            }
        }
        System.out.println("largest number = "+max+" Second largest number = "+ secondMax);

    }
}

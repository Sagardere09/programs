public class RotateMatrix {
    public static void main(String [] args){
        RotateMatrix rotateMatrix = new RotateMatrix();
        int[][] num ={{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrix.rotateMatrix90(num);
    }

    private void rotateMatrix90(int[][] num) {
        for(int i = 0; i<num.length; i++){
            System.out.print("[ ");
            for(int j = 0; j<num[i].length; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println("--------");
        for(int i = 0; i<num.length; i++){
            System.out.print("[ ");
            for(int j = num[i].length-1; j>=0; j--){
                System.out.print(num[j][i] + " ");
            }
            System.out.println("]");
        }
    }
}

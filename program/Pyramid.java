public class Pyramid {
    public static void main(String [] args){
        Pyramid pyramid = new Pyramid();
        String str ="abcdefghij";
        int num = 4;
        pyramid.printPyramid(str, num);
    }

    private void printPyramid(String str, int num) {
        int len = str.length();
        int charNo = 0;
        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= num -i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(str.charAt(charNo) + " ");
                charNo++;
            }
            System.out.println();
        }
    }
}

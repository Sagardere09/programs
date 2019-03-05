import java.util.HashSet;
import java.util.Set;

public class RemoveDublicateElement {
    public static void main(String [] args){
        RemoveDublicateElement removeDublicateElement = new RemoveDublicateElement();
        int [] num = {0,0,1,1,1,2,2,3,3,4};
        removeDublicateElement.removeDublicate(num);
    }

    private void removeDublicate(int[] num) {
        Set<Integer> uniqueSet = new HashSet<>();

        for(int i : num){
            uniqueSet.add(i);
        }
        System.out.println("length = "+uniqueSet.size() +", Unique Element = "+uniqueSet);
    }
}

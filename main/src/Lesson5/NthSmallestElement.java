import java.util.ArrayList;
import java.util.List;

public class nthSmallestElement {
    public static void main (String[] args){
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(16);
        values.add(45);
        values.add(11);
        values.add(2);

        System.out.println(values);

        System.out.println(nthSmallestElement1(values, 3));

    }

    public static int nthSmallestElement1 (List<Integer> values, int n){

        int smallest = Integer.MAX_VALUE;
        int nthSmallest = Integer.MAX_VALUE;

        for (Integer number:values){
            if (number < smallest){
                smallest = values.get(n);
            } else if (number > smallest && number < nthSmallest){
                nthSmallest = values.get(n);
            }
        }
        return nthSmallest;


    }
}

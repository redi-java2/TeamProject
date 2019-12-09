import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PartitionIntegers {

    public static void main (String[] args){

        List<Integer> values = new ArrayList<>();
        values.add(16);
        values.add(14);
        values.add(9);
        values.add(10);
        System.out.println(values);

        System.out.println(partitionIntegers(values, 4));

    }

    public static Set<Integer> partitionIntegers(List<Integer> values, int n){
        Set<Integer> newValues = new HashSet<>();
        for ( Integer number: values){
            if (number % n >= 0){
                newValues.add(number);
            }
        }
        return newValues;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Partialsums {
    public static void main(String[] args){

        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(5);
        num.add(2);
        num.add(4);

        System.out.println(num);
        System.out.println(PartialSum(num));


    }

    public static List<Integer> PartialSum (List<Integer> num){
        int sum = 0;
        List<Integer> newNum = new ArrayList<>();
        for(Integer element:num){
            sum = element + sum;
            newNum.add(sum);

        }
        return newNum;

    }
}

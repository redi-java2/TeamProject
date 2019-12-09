import java.util.ArrayList;
import java.util.List;

public class LongestElementOfAList {

    public static String longestString(List<String> name){
        int maxLength= 0;
        String longestElement = "";

        for(String each:name){
            if ( each.length() > maxLength){
                maxLength = each.length();
                longestElement = each;

            }

        }
        return longestElement;
    }

    public static void main (String[] args){

        List<String> name = new ArrayList<>();
        name.add("Adeola");
        name.add("Lanre");
        name.add("Tunbosun");
        System.out.println("longest element is: "+ longestString(name));

    }


}
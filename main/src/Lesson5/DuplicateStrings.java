import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateStrings {
    public static void main (String[] args){
        System.out.println("Enter some names here: ");
        Scanner scanner = new Scanner(System.in);
        Set<String> strings = new HashSet<>();
        while(true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            strings.add(input);
        }
        System.out.println(strings);
    }
}

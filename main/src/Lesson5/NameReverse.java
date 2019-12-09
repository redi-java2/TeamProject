import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameReverse {
    public static void main(String[] args){
        System.out.println("Enter four names here: ");
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            names.add(input);
            }
        System.out.println(names);
        // names now in reverse

        for (int i = names.size()-1; i >= 0; i--){

            System.out.println(names.get(i));
        }

    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    public static ArrayList<Integer> getInput(){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        while (true){
            System.out.println("Enter Array elements (Done to Submit): ");
            String userInput = scan.nextLine();
            if(userInput.matches("[-0-9]+")) {
                array.add(Integer.parseInt(userInput));
            } else if (userInput.equalsIgnoreCase("done")) {
                break;
            } else System.out.println("Invalid Input");
        }
        return array;
    }
}

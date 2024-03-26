import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> weaponList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        String input = sc.nextLine();

        String[] weaponsArray = input.split("\\s+");

        for (String weapon : weaponsArray) {
            if (weapon.equalsIgnoreCase("done")) {
                break;
            }
            weaponList.add(weapon);
        }

        System.out.println("List of weapons: " + weaponList);
    }
}

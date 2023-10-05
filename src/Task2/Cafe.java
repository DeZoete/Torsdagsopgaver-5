package Task2;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Cafe {

   private  ArrayList<String> coffeeMenu = new ArrayList<String>();
public void loadMenuData(){
    File file = new File("src/Task2/Coffees.txt");

    try {
        Scanner scan = new Scanner(file);//System.in

        scan.nextLine();
        while(scan.hasNext()) {
            String Coffees = scan.nextLine();
            coffeeMenu.add(Coffees);
        }

    }catch (FileNotFoundException e){
        System.out.println("file not found");

    }
}

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
}

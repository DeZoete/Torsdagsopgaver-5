
package Task2;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {


    public static void main(String[] args) {

Cafe cafe = new Cafe();//2.g In the main method create a new instance of the Cafe class and call its loadMenuData() -method.
cafe.loadMenuData();

for(String c: cafe.getCoffeeMenu()){
        System.out.println(c);

        }

    }
    }

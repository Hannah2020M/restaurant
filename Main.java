package restaurant;
import restaurant.MenuItems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MenuItems item1 = new restaurant.MenuItems("Baby back ribs",11.35);

        System.out.println(item1.getName());
    }
}


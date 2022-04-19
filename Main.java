package restaurant;


public class Main {

    public static void main(String[] args) {
        MenuItems item1 = new restaurant.MenuItems("Baby back ribs",11.35);
        MenuItems item2 = new restaurant.MenuItems("coleslaw",5.35);

        System.out.println(item1.getName());
        System.out.println(item2.getName());
    }
}


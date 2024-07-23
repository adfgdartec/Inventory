public class Main {
    public static void main(String[] args){
        //Creating the array
        String[] inventory = new String[5];

        //Add items into the array
        inventory[0] = "HP Motion";
        inventory[1] = "James Dean";
        inventory[2] = "Key";

        // Call printInventory() Method
        printInventory(inventory);

        if(checkInventory(inventory, "Key")){
           System.out.println("You opened the lock!");
        }

    }

    public static void printInventory(String[] inventory){
        for(String item: inventory){
            System.out.println(item);
        }
    }

    // Search player's inventory
    public static boolean checkInventory(String[] inventory, String toCheck){
        for(String item: inventory){
            if(item.equals(toCheck)){
                return true;
            }
        }
        return false;
    }
}

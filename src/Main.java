import java.util.*;

public class Main {
    //Begins Main()
    public static void main(String[] args) {
//      Variable declerations
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        String input = scanner.nextLine();
        List<Gizmo> GizmoList = new ArrayList<>();

//      Gizmo objects added to array list
        GizmoList.add(new Gizmo("Waxbill", "618001", 2015, 3, 499.99));
        GizmoList.add(new Gizmo("Heron", "618002", 2016, 13, 299.99));
        GizmoList.add(new Gizmo("Crane", "618003", 2017, 195, 49.99));
        GizmoList.add(new Gizmo("Duck", "618004", 2018, 295, 99.99));
        GizmoList.add(new Gizmo("Wallaby", "618005", 2019, 973, 149.99));
        GizmoList.add(new Gizmo("Egret", "618006", 2020, 495, 199.99));

//              Begins while loop based on user prompted exit condition
                while (!exit) {

//                  User menu prompt
                    System.out.println("\nWhat would you like to do?");
                    System.out.println("1. Add a new entry");
                    System.out.println("2. Remove an entry specified by the user");
                    System.out.println("3. Sort the list by year");
                    System.out.println("4. Sort the list by price");
                    System.out.println("5. Sort the list by quantity");
                    System.out.println("6. Calculate and print the total value of the Gizmo");
                    System.out.println("7. Print Gizmo");
                    System.out.println("8. Print Gizmo in a table format");
                    System.out.println("9. Exit");

//                  Begin switch based off of valid input
                    switch (input) {
                        case "1":

                          //Prompts user for new Gizmo object metadata
                            try {
                                System.out.print("Enter the product name: ");
                                String productName = scanner.nextLine();

                                System.out.print("Enter the product number: ");
                                String productNumber = scanner.nextLine();

                                System.out.print("Enter the year: ");
                                int year = Integer.parseInt(scanner.nextLine());

                                System.out.print("Enter the quantity: ");
                                int quantity = Integer.parseInt(scanner.nextLine());

                                System.out.print("Enter the price: ");
                                double price = Double.parseDouble(scanner.nextLine());

//                              Adds user metadata to new Gizmo object
                                GizmoList.add(new Gizmo(productName, productNumber, year, quantity, price));
                                System.out.println("Entry added successfully.");

                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Please try again.");
                            }
                            break;
                        case "2":
                            try {
//                              Prompts user for product number of Gizmo item to be removed
                                System.out.print("Enter the product number of the entry you wish to remove: ");
                                String productNumber = scanner.nextLine();

                             // Creates a temporary Gizmo object for removable object within Gizmo list
                                Gizmo toRemove = null;

                              //Loop to find Gizmo product number
                                for (Gizmo item : GizmoList) {
                                    if (item.getProductNumber().equals(productNumber)) {
                                        toRemove = item;
                                        break;
                                    }
                                }
//                              Removes found item from Gizmo list
                                if (toRemove != null) {
                                    GizmoList.remove(toRemove);
                                    System.out.println("Entry removed successfully.");
                                } else {
                                    System.out.println("Entry not found.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Please try again.");
                            }
                            break;
                        case "3":

                          //Prints Gizmo list in ascending order by year
                            GizmoList.sort(Comparator.comparingInt(Gizmo::getYear));
                            System.out.println("Gizmo sorted by year.");
                            break;
                        case "4":

                            //Prints Gizmo list in ascending order by price
                            GizmoList.sort(Comparator.comparingDouble(Gizmo::getPrice));
                            System.out.println("Gizmo sorted by price.");
                            break;
                        case "5":

                            //Prints Gizmo list in ascending order by price
                            GizmoList.sort(Comparator.comparingInt(Gizmo::getQuantity));
                            System.out.println("Gizmo sorted by quantity.");
                            break;
                        case "6":

                            //Prints Gizmo inventory total using Lamdas .sum
                            double totalValue = GizmoList.stream()
                                    .mapToDouble(item -> item.getPrice() * item.getQuantity())
                                    .sum();
                            System.out.printf("Total Gizmo value: $%.2f%n", totalValue);
                            break;
                        case "7":
                            System.out.println("Gizmo:");
                            for (Gizmo item : GizmoList) {
                                System.out.println(item.toString());
                            }
                            break;
                        case "8":
                            System.out.println("Product Name | Product Number | Year | Quantity | Price ($)");
                            System.out.println("--------------------------------------------------------");
                            for (Gizmo item : GizmoList) {
                                System.out.printf("%-12s | %13s | %4d | %8d | %,8.2f%n",
                                        item.getProductName(), item.getProductNumber(), item.getYear(),item.getQuantity()
                                                ,item.getPrice());}
                            break;
                        case "9":

                          //Exits while loop when boolean condition set to true
                            exit = true;
                            break;
                        default:
                            System.out.println("Invalid input. Please try again.");
                    }//ends switch
}// end while loop
    }// ends main
}// ends class
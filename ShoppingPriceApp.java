package Shopping;

import java.util.Scanner;
public class ShoppingPriceApp {
    Scanner scan = new Scanner(System.in);

    private  int bookPrice ;
    private  int bagPrice ;
    private  int shoePrice ;

    private int userChoiceNumber;

    public void setBook() {
        System.out.print("How many books? ");
        int noOfBooks = scan.nextInt();
        System.out.println("Each book cost - 200");
        bookPrice = noOfBooks * 200 ;
        System.out.printf("%d books cost %d%n", noOfBooks, bookPrice);
    }

    public void setBag() {
        System.out.print("How many bags? ");
        int noOfBags = scan.nextInt();
        System.out.println("Each bag cost - 500");
        bagPrice = noOfBags * 500 ;
        System.out.printf("%d books cost %d%n", noOfBags, bagPrice);
    }

    public void setShoe() {
        System.out.print("How many shoes? ");
        int noOfShoes = scan.nextInt();
        System.out.println("Each shoe cost - 50");
        shoePrice = noOfShoes * 50 ;
        System.out.printf("%d shoes cost %d%n", noOfShoes, shoePrice);
    }

    public void iteratePrompt(){
        System.out.print("Would you like to continue shopping? Type \"yes\" to continue, Type \"no\" to check out - \n");
    }


    public void iterate(){
        String checkCondition;
        do {
            iteratePrompt();
            checkCondition = scan.nextLine();
            if (checkCondition.equalsIgnoreCase("yes")){
                prompt();
                collectingUserChoice();
            }
        }while (checkCondition.equalsIgnoreCase("yes"));
    }

    public void prompt(){
        System.out.print("""
                Press 1 for book
                Press 2 for bag
                Press 3 for shoe
                Press 99 to cancel :
                 """);
    }

    public void collectingUserChoice (){
        userChoiceNumber = scan.nextInt();
        switch (userChoiceNumber){
            case 1 :
                setBook();
                break;
            case 2 :
                setBag();
                break;
            case 3:
                setShoe();
                break;
            case 99 :
                break;
            default:
                System.out.println("Invalid input. Try again!");
                prompt();
                collectingUserChoice();
                break;
        }
    }

    public void welcomeMessage(){
        System.out.println("Welcome to Sherif Shopping");
        System.out.println("");
    }

}

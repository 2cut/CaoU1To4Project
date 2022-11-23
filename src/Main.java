import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello and welcome!\n");
        Reserve plane = new Reserve();
        Reserve.genReserve();
        boolean inUse = true;
        while (inUse) {
            System.out.println("\nVhich seat would you like?");
            int seat = scan.nextInt();
            Reserve.price(seat);
            System.out.print("Would you like to reserve another seat? Reply \"1\" for yes or \"2\" for no.");
            int answer = scan.nextInt();
            if (answer==2) {
                inUse = false;
            }
        }
        System.out.println("Your total is: "+Reserve.getTotal());
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String welcome = "Hello and welcome!\nThe prices are $200 for an asle seat, $250 for a middle seat, and $300 for a window seat.\nIf you have a total above $1000, you will receive a $100 discount.";
        welcome+= "\nWhat is your name?";
        System.out.println(welcome);
        String user = scan.nextLine();
        Reserve plane = new Reserve(user);
        plane.seatList();
        boolean inUse = true;
        while (inUse) {
            System.out.println("\nWhich seat would you like?");
            int seat = scan.nextInt();
            plane.price(seat);
            System.out.print("Would you like to reserve another seat? Reply \"1\" for yes or \"2\" for no.");
            int answer = scan.nextInt();
            if (answer==2) {
                inUse = false;
            }
        }
        System.out.println("Your total is: "+plane.getTotal());

        plane.discount();
        System.out.print(plane.toString());
    }
}

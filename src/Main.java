import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String welcome = "Hello and welcome!\nThe prices are $200 for an asle seat, $250 for a middle seat, and $300 for a window seat.\nIf you have a total above $1000, you will receive a $100 discount.";
        System.out.println(welcome);
        Reserve plane = new Reserve();
        plane.genReserve();
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
        String totalString = (int)Reserve.getTotal()+"";
        //fix bug discount doesn't work
        if (totalString.length()>4) {
            System.out.println("Since your total is over $1000, we will give you an $100 dollar discount.");
            System.out.println(Reserve.getTotal()-100+" is your new total.");
        }
        System.out.print(plane.toString());
    }
}

public class Reserve {
    private double total = 0;
    private String name;

    public Reserve(String guest) {
        name = guest;
    }
    public Reserve() {
    }
    private static int k = 1;
    public String toString() {
        return "Thank you and have a nice day, "+name+"!";
    }
    public void seatList() {
        for (int i = 0; i<10; i++) {
            for (int j = 1; j<7; j++) {
                if (j==4) {
                    System.out.print(" ");
                }
                if (k<10) {
                    System.out.print("0"+k+" ");
                } else {
                    System.out.print(k + " ");
                }
                k++;

            }
            System.out.println();
        }
    }
    public void price(int seatnum) {
        if (seatnum>=49) {
            System.out.println("Your seat is in the back, you will have an earlier boarding time than others.");
        }
        if ((seatnum-1)%6==0 || seatnum%6==0) {
            System.out.println("This is a window seat, it will cost extra.");
            total+= 300.99+((int)(Math.random()*10));
        } else if (seatnum%3==0||(seatnum-1)%3==0){
            System.out.println("This is a asle seat, it will cost less.");
            total+= 200.99+((int)(Math.random()*10));
        } else {
            System.out.println("This is a middle seat, it will be regular price.");
            total+= 250.99+((int)(Math.random()*10));
        }
    }
    public void discount() {
        String totalString = (int)total+"";

        if (totalString.length()>=4) {
            System.out.println("Since your total is over $1000, we will give you an $100 dollar discount.");
            System.out.println(total-100+" is your new total.");
        }
    }
    public double getTotal () {
        return total;
    }
}

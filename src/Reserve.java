public class Reserve {
    private static double total = 0;
    public Reserve() {
    }
    private static int k = 1;
    public static void genReserve() {
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
    public static void price(int seatnum) {
        if ((seatnum-1)%6==0 || seatnum%6==0) {
            System.out.println("This is a window seat, it will cost extra.");
            total+= 300.99;
        } else if (seatnum%3==0||(seatnum-1)%3==0){
            System.out.println("This is a asle seat, it will cost less.");
            total+= 200.99;
        } else {
            System.out.println("This is a middle seat, it will be regular price.");
            total+= 250.99;
        }
    }
    public static double getTotal () {
        return total;
    }
}
public class AdvancePattern{
    public static void butterfly(int n) {
        //First Half
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //2nd Half
            for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        butterfly(4);
    }
}

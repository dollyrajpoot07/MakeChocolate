// MakeChocolate
// We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). 
// Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

// makeChocolate(4, 1, 9) → 4
// makeChocolate(4, 1, 10) → -1
// makeChocolate(4, 1, 7) → 2

import java.util.*;

public class MakeChocolate {
    public static int makeChocolate(int small, int big, int goal) {
        int badiChoco = (big * 5);
        int chotiChoco = small;
        int rem = goal % 5;
        int sum = chotiChoco + badiChoco;

        if ((rem <= small) && ((goal - badiChoco) > 4)) {
            return rem + 5;
        } else if (sum < goal) {
            return -1;
        } else if (rem <= small) {
            return rem;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();
        int make_chocolate = makeChocolate(a, b, c);
        System.out.println("Small bars required to make Chocolates are: " + make_chocolate);
        sc.close();
    }

}
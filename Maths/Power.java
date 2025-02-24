
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

//
public class Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int x = s.nextInt();
        System.out.println(optimized(n, x));
        System.out.println(calculate(n, x));
    }

    public static int calculate(int n, int x) {
        if (x == 0) {
            return 1;
        } else {
            return n * calculate(n, x - 1);
        }
    }

    public static int optimized(int n, int x) {
        if (x == 0) {
            return 1;
        }
        if (x % 2 == 0) {
            return optimized(n * n, x / 2);
        } else {
            return n * optimized(n, x - 1);
        }

    }
}

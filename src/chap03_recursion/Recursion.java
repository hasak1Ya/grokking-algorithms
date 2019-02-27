package chap03_recursion;

/**
 * 递归
 *
 * @author mzj
 * @since 1.0
 * 19-2-28
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    private static int fact(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }
}

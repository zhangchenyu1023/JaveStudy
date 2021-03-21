package note1;

import java.util.Scanner;

/**
 * @author solang
 * @date 2021-03-20 14:50
 */
public class ScannerLearn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.next();
        int b=sc.nextInt();

        System.out.println(a);
        System.out.println(b);

        System.out.println(new Scanner(System.in).next());
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[9];
        int max = Integer.MIN_VALUE;
        int index = 0;

        for(int i=0; i < A.length; i++) {
            A[i]=scanner.nextInt();
            if(A[i] > max) {
                max = A[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);




    }
}

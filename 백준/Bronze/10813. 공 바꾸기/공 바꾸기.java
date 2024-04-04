import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int tmp = 0;
        int[] A = new int[N];

        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
        }
        for (int j = 0; j < M; j++) {
            int I = scanner.nextInt();
            int J = scanner.nextInt();
            tmp = A[I - 1];
            A[I - 1] = A[J - 1];
            A[J - 1] = tmp;
        }
        for (int k = 0; k < A.length; k++) {
            System.out.print(A[k] + " ");
        }
    }
}




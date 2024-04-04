import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];

        for (int i=0; i<M; i++) {
            int I = scanner.nextInt();
            int J = scanner.nextInt();
            int K = scanner.nextInt();

            for(int j = I-1; j < J; j++ ) {
                A[j]=K;
            }
        }
        for(int k = 0; k < A.length; k++) {
            System.out.print(A[k] + " ");

            }
        }

    }


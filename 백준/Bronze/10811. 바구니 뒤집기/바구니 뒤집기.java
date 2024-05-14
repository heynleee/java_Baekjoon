import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 바구니의 개수(1~N의 배열)
        int M = scanner.nextInt(); // 바구니의 순서를 역순으로 만들려고 하는 횟수

        int[] baskets = new int[N];
        for(int i = 0; i<N; i++){
            baskets[i] = i+1;
        }
        for(int i=0; i<M; i++) {
            //인덱스가 0부터 시작하기 때문에 -1
            int start = scanner.nextInt() - 1;
            int end = scanner.nextInt() - 1;

            while (start < end) {
                int temp = baskets[start];
                baskets[start] = baskets[end];
                baskets[end] = temp;

                start++;
                end--;
            }
        }
        for(int i=0; i<N; i++){
            System.out.print(baskets[i]+" ");
        }
        }

    }






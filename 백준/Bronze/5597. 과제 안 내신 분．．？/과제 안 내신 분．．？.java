import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] isPresent = new boolean[31];

        for(int i=0; i<28; i++) {
            int n = scanner.nextInt();
            isPresent[n] = true;
        }

        for(int i=1; i<=30; i++){
            if(!isPresent[i]) {
                System.out.println(i);
            }
        }

        }
    }

/*방법 2
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[31];

        for(int i=1; i<=28; i++) {
            a[scanner.nextInt()]++;
        }
        for(int j=1; j<=30; j++) {
            if(a[j] == 0) {
                System.out.println(j);
            }
        }
        }
    }
*/






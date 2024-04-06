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





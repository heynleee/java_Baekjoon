import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        boolean bl;
        int cnt = 0;

        for(int i = 0; i<a.length; i++) {
            a[i] = scanner.nextInt() % 42;
        }
        for(int i=0; i<a.length; i++){
            bl = false;
            for(int k=i+1; k<a.length; k++){
                if(a[i]==a[k]) {
                    bl = true;
                    break;
                }
            }
            if(!bl) {
                cnt ++;
            }
        }
        System.out.println(cnt);

    }
    }





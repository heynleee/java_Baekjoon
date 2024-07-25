import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=0; i<T; i++) {
            int R = sc.nextInt();
            String S = sc.next();//공백 만날 시 읽기 중지, nextLine은 전체 다 읽음

            for(int j=0; j<S.length();j++){
              for(int k=0; k<R;k++) {
                  System.out.print(S.charAt(j));
              }
            }
            System.out.println();

        }

    }
}
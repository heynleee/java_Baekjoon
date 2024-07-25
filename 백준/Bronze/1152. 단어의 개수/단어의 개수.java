import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     String words = sc.nextLine();

     StringTokenizer str = new StringTokenizer(words," ");
        System.out.print(str.countTokens());
    }
}
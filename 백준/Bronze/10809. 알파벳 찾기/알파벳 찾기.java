import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];//알파벳의 첫 등장 위치를 지정(알파벳 개수)

        for(int i=0; i<arr.length;i++) {
            arr[i] = -1;//배열의 모든 값 -1로 초기화 (각 알파벳이 아직 등장x를 나타냄)
        }

        String S = sc.nextLine();//사용자로부터 문자열 입력 받음

        for(int i=0; i<S.length();i++){
            char ch = S.charAt(i);//i번째 문자를 ch에 저장

            if(arr[ch - 'a'] == -1){
                arr[ch-'a']=i; //a의 유니코드는 97
            }//ch가 a라면 ch-'a'=0이고, 'b'라면 1
        }

        for(int val : arr) {// 배열 arr의 모든 요소를 하나씩 순서대로 접근하여 'val'변수에 할당
            System.out.print(val+" ");
            //첫 번째 반복: val = arr[0] → val은 0 → System.out.print(0 + " ") 출력
        }
    }
}
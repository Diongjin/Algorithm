import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int solution[] = new int[n];
        for (int i = 0; i < n; i++) {
            solution[i] = sc.nextInt();
        }

        int bonus=0;
        int score=0;
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            if(solution[i] == 1){
                if(flag){   // 연속으로 문제 맞힐때
                    bonus++;    // 점수가 1점씩 증가함.
                }
                else{       // 초기 문제 맞췄을 때
                    bonus=1;    // 1문제당 1점.
                    flag=true;  // flag를 true로 하여 보너스 점수를 넣어줌
                }
                score +=bonus;  // 점수 증가.
            }
            else{       // 문제를 틀렸을 때
                flag=false; // flag를 false로
                bonus=0;    // 보너스 점수 초기화 즉 틀렸다는 증거.
            }
        }
        System.out.println(score);  // 총합 출력
    }
}

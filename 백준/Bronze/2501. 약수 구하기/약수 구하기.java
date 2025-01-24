import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;

        for(int i = 1; i <= n; i++) {   // n이 6이면 1부터 6까지 모두 실행
            if(n%i == 0) { // 1~n까지 시도해서 나누어 떨어질경우 개수 증가.
                count++;
            }

            if(count == k) {
                System.out.println(i);
                break;
            }

        }
        if(count<k){
            System.out.println(0);
        }
    }
}

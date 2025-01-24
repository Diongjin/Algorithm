import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int now = 0;

        for(int i =0;i<4;i++){
            int out = sc.nextInt();
            int in = sc.nextInt();

            now -=out;
            now += in;

            max = Math.max(max,now);
        }
        System.out.println(max);
    }
}

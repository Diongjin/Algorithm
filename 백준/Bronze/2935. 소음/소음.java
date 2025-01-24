import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger A = new BigInteger(br.readLine());
        String str = br.readLine();
        BigInteger B = new BigInteger(br.readLine());

        switch (str) {
            case "+":
                System.out.println(A.add(B));
                break;
            case "*":
                System.out.println(A.multiply(B));
                break;
        }
    }
}

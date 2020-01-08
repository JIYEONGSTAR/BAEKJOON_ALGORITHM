//평균은 넘겠지
import java.util.Scanner;

public class Q4344 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n, sum, count;
        double avg;
        int score[] = new int[1000];
         
        for (int i = 0; i < c; ++i) {
            n = sc.nextInt();
            sum = 0;
            count = 0;
            for (int j = 0; j < n; ++j) {
                score[j] = sc.nextInt();
                sum += score[j];
            }
            avg = (double)sum / n;
             
            for (int j = 0; j < n; ++j) {
                if (score[j] > avg) {
                    count++;
                }
            }
            System.out.printf("%.3f", 100.0 * count / n);//소수점 셋째 자리까지 출력
            System.out.println("%");
        }
        sc.close();
    }
}

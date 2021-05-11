
//A / B - 2
//20210512
//수학,사칙연산,임의 정밀도 / 큰 수 연산


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
 
public class Q15792 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nums = br.readLine().split(" ");
        System.out.println(new BigDecimal(nums[0]).divide(new BigDecimal(nums[1]), 1000, BigDecimal.ROUND_HALF_UP));
        
        br.close();
    }
}


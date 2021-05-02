//배부른 마라토너
//20210406
//해시 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q10546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();//해시 
        for(int i = 0; i < n; i++) {//해시에 추가 
            String key = br.readLine();
            if(map.get(key) == null) {
                map.put(key, 1);
            }else {
                map.put(key, map.get(key) + 1);
            }
        }

        for(int i = 0; i < n-1; i++) {
            String key = br.readLine();
            map.put(key, map.get(key) - 1);//같으면 해시에서 지움 
        }

        for(String key : map.keySet()) {
            if(map.get(key) != 0) { //해시에 남아있는거 출력 
                System.out.println(key);
                break;
            }
        }
    }
}
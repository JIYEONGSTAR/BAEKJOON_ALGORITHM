//셀프 넘버
public class Q4673 {
	public static int nonselfnum(int n) {// 셀프넘버가 아닌 수 리턴,생성자를 인자로
		int num = n, a;
		while (n != 0) {
			a = n % 10;
			num += a;
			n = n / 10;
		}
		return num;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[10001];
		for (int i = 0; i <= 10000; i++) {
			int a = nonselfnum(i);
			if (a <= 10000)
				num[a] = num[a] + 1;
		}
		for (int i = 0; i <= 10000; i++) {
			if (num[i] == 0) {
				System.out.println(i);
			}
		}
	}

}

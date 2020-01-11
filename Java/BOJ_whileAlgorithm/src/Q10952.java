//A+B - 5
import java.util.Scanner;
public class Q10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a,b;
		while(true) {
		a=sc.nextInt();
		b=sc.nextInt();
		if(a==0&&b==0)
			break;
		System.out.println(a+b);
		
		}
		sc.close();
	}

}

import java.util.Scanner;

public class BirthdayChocolate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int d = sc.nextInt();
		
		int m = sc.nextInt();
		
		int count = 0;
		
		for(int i=0;i<n-m+1;i++) {
			int temp = 0;
			for(int j=i;j<i+m;j++) {
				temp = temp+arr[j];
			}
			if(temp==d)
				count++;				
		}
		System.out.println(count);
	}
}

import java.util.Scanner;

public class BreakingtheRecords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int min=arr[0],max=arr[0];
		int countMin=0, countMax=0;
		for(int i=1;i<n;i++) {
			if(min>arr[i]) {
				countMin++;
				min=arr[i];
			}	
			if(max<arr[i]) {
				countMax++;
				max=arr[i];
			}	
		}
		System.out.println(countMax+" "+countMin);
	}
}

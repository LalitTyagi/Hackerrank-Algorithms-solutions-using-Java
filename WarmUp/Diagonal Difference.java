public class Solution {
    public static void main(String[] args) throws IOException {
        int n,sum1=0,sum2=0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int a[][] = new int[n][n];
		for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
			     a[i][j]=s.nextInt();
            }
		}
        for(int i=0;i<n;i++){
			sum1=sum1+a[i][i];
            }
        int b=0;
        for(int j=n-1;j>=0;j--){
			sum2=sum2+a[b][j];
            b++;
        }
		System.out.println(Math.abs(sum1-sum2));
    }
}

public class Solution {
    public static void main(String[] args){
        int A[] = new int[3];
        int B[] = new int[3];
		int a,b;
        a=b=0;
		Scanner s = new Scanner(System.in);
		for(int i=0;i<3;i++){
			A[i]=s.nextInt();
		}
        for(int i=0;i<3;i++){
			B[i]=s.nextInt();
		}
        for(int i=0;i<3;i++){
			if(A[i]>B[i])
                a++;
            else if (A[i]<B[i])
                b++;
		}
		System.out.println(a+" "+b);
	}
}

public class Solution {
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	int s,t,a,b,m,n;
        s = in.nextInt();
        t = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        m = in.nextInt();
        n = in.nextInt();
        int apple,orange;
        int count1=0,count2=0;
        for(int i=0;i<m;i++){
            apple = in.nextInt();
            if(a+apple>=s && a+apple<=t){
                count1++;
            }
        }
        for(int i=0;i<n;i++){
            orange = in.nextInt();
            if(b+orange>=s && b+orange<=t){
                count2++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}

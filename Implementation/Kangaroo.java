package Implementation;
import java.util.*;

public class Kangaroo {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x1,x2,v1,v2;
		
		x1 = in.nextInt();
		v1 = in.nextInt();
		x2 = in.nextInt();
		v2 = in.nextInt();
		
		if(v2>v1 && x2>=x1) {
			System.out.println("NO");
		}
		else if(v1>=v2 && ((x2-x1)%((float)(v1-v2))==0)){
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}
}

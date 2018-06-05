public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        float a=0,b=0,c=0;
six decimal places
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            if(m>0)
                a++;
            else if(m<0)
                b++;
            else 
                c++;
        }
        System.out.println(a/n);
        System.out.println(b/n);
        System.out.println(c/n);
        

        scanner.close();
    }
}

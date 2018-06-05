public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        int sum=0,min=0,max=0;

        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextInt();
            if(i==0){
                min=arr[0];
                max=arr[0];
            }
            sum+=arr[i];
            if(min>arr[i])
                min=arr[i];
            
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println((sum-max) +" "+ (sum-min));
    }
}

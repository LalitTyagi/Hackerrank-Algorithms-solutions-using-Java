public class Solution {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();
        int arr[] = new int[a];
        int max=0;
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
            if(i==0){
                max=arr[0];
            }
            if(max<arr[i])
                max=arr[i];
        }
        int count=0;
        for(int i=0;i<a;i++){
            if(max==arr[i])
                count++;
        }
        System.out.println(count);
    }
}

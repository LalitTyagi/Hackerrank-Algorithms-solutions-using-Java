public class Solution {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String time = s.next();
        String arr[] = time.split(":");
        String AmPm = arr[2].substring(2,4);

        int hh,mm,ss;
        hh = Integer.parseInt(arr[0]);
        mm = Integer.parseInt(arr[1]);
        ss = Integer.parseInt(arr[2].substring(0,2));

        int h=hh;
        if(AmPm.equals("AM") && hh==12)
            h=0;
        else if(AmPm.equals("PM") && hh<12)
            h+=12;
        System.out.printf("%02d:%02d:%02d",h,mm,ss);

    }
}

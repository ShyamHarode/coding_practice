

public class maxVolumeContainer {
    public static void main(String[] args) {
        int arr[] ={2,2,50,2,2,3};
        int n = arr.length;
        int max = maxVol(arr, n);
        System.out.println(max);
    }

    public static int maxVol(int arr[], int n) {
        int start =0;
        int end = n-1;
        int vol =0;
        int mVol =0;
    
            while (start<=end) {
               
                vol = (Math.min(arr[start], arr[end])* (end-start));
                mVol = Math.max(mVol, vol);
                if(start<end)
                start++;
                else end--;
            }
        
        return mVol;
    }
    
}

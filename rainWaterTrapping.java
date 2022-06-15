public class rainWaterTrapping {
    public static int maxWater(int arr [], int n){
        int left[]= new int [n];
        int  right[]= new int [n];
        int max =0;
        for(int i=0; i<n; i++){
            if(arr[i]>max)
            max=arr[i];
            left[i]=max;
        }
        max=0;
        for(int i=n-1; i>=0; i--){
            if(max<arr[i])
            max = arr[i];
            right[i]= max;
        }
        int ans=0;
        for(int i=0; i<n; i++){
            ans += (Math.min(left[i],right[i])-arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] =  {3,2,1,7,5,2,0,1,4};
        int n = arr.length;
        System.out.println(maxWater(arr, n));
    }
}

public class maxSubArrayCircularSum {
    public static int maxSum(int arr[], int n){
        int max =0;
        int arrSum =0;
        int maxSubArraySum = Integer.MIN_VALUE;
        int minSubarraySum=Integer.MIN_VALUE;
        int neg []= new int [n];
        for(int i=0; i<n; i++){
            arrSum +=arr[i];
            max +=arr[i];
            if(max>maxSubArraySum)
                maxSubArraySum =max;
            if(max<0)
                max=0;
            neg[i] = -1*arr[i];
        }
        max=0;
        for(int i=0; i<n; i++){
            max += neg[i];
            if(max>minSubarraySum)
                minSubarraySum =max;
            if(max<0)
                max=0; 
        }
        System.out.println(arrSum);
        System.out.println(maxSubArraySum);
        System.out.println(minSubarraySum);

        int ans = arrSum-(-1*minSubarraySum);
        return ans;
    }

    public static int maxByKadane(int arr [], int n){
        int max =0;
        int min =0;
        int arrSum =0;
        int maxSubArraySum = arr[0];
        int minSubarraySum= arr[0];
        
        for(int i=0; i<n; i++){
            arrSum +=arr[i];
            max= Math.max(max+arr[i], arr[i]);
            maxSubArraySum = Math.max(maxSubArraySum, max);
            
            min= Math.min(min+arr[i], arr[i]);
            minSubarraySum = Math.min(maxSubArraySum, min);
        }
        System.out.println(arrSum);
        System.out.println(maxSubArraySum);
        System.out.println(minSubarraySum);

        int ans = arrSum-(minSubarraySum);
        return ans; 
    }

    //incomplete
    public static int MaxCircularSum(int arr[], int n){
        int curr=0;
        int maxSum=Integer.MIN_VALUE;
        boolean flag=true;
        for(int i=0; i<n; i++){
            if(arr[i]>0)
            flag =false;
            curr = arr[i];
            if(maxSum<curr)
            maxSum = curr;
        }
        if(flag)
        return maxSum;

        int brr [] = new int [2*n];
        int i=0;
        while(i<2*n){
            int j =i%n;
            brr[i]=arr[j];
            i++;
        }
        int sum=0;
         maxSum=0;
         
         int j=0;
        for(int k=0; k<2*n; k++){
                sum +=brr[k];
                if(sum>maxSum && j<n){
                    maxSum = sum;
                    j++;
                }
                if(sum<0){
                    sum =0;
                    j=0;
                }
        }
        for(int k: brr)
        System.out.print(k+" ");
        return maxSum;
    }
   
    public static void main(String[] args) {
        int arr[] = {5,-4,8,7,-2,6,-8,-1};
        int n = arr.length;
        System.out.println(maxSum(arr, n));
        System.out.println();
        System.out.println(maxByKadane(arr, n));
        System.out.println();
        System.out.println(MaxCircularSum(arr, n));
    }
}

public class maxSumSubarray {
        public static void main(String[] args) {
        // "static void main" must be defined in a public class.
    
            int arr[]={10,-20,30,40,7,-8,-45,-50,15,-10,12,-5,2,-55};
            int n=arr.length;
            int start =0;
            int end =0;
            int currSum=0;
            int maxSum=0;
            int count=0;
            int mxc=0;
            int x=0;
            for(int i=0; i<n; i++){
                // {10,-20,30,40,7,-8,-45,-50,15,-10,12,-5,2,-55};
                currSum += arr[i];    
                
                if(maxSum<=currSum){
                    maxSum=currSum;
                    start = x;
                    end=i; 
                    count++;
                    mxc =Math.max(mxc, count);
                }
                if(currSum<0){
                    currSum=0;
                    x=i+1;
                    count=0;
                    
                }
            }
            System.out.println(maxSum);
            while(start<=end){
                System.out.print(arr[start]+" ");
                start++;
            }
            System.out.println();
             System.out.println(mxc);
        }
    }
        

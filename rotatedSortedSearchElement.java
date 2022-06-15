
public class rotatedSortedSearchElement {
    public static int binarySearch(int arr[], int n, int k){
        int start =0;
        int end = n-1;
        
        while(start<=end){
          int  mid = start + (end-start)/2;
            if(arr[mid]==k){
                return mid;
            }          
            if(arr[mid]>=arr[start]){
                if(arr[mid]>k && arr[start]<=k){
                end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(arr[mid]< k && arr [end]>=k){
                    start = mid+1;
                }
                else
                    end = mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,1,2,3,4};
        int n = arr.length;
        int k =0;
        int ans = binarySearch(arr, n, k);
        System.out.println(ans);
    }
}

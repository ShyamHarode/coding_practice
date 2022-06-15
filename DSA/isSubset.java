import java.util.*;

public class isSubset {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            int arr1 [] = new int [m]; 
            int arr2 [] = new int [n]; 

            for(int i=0; i<m; i++){
                arr1[i]= sc.nextInt();
            }
            for(int i=0; i<n; i++){
                arr2[i]= sc.nextInt();
            }
            
            // if(checkIfSubset(arr1, arr2, m, n))
            //    System.out.print("yes");
            // else
            // System.out.println("no");

        //     if(subsetOfArray(arr1, arr2, m, n))
        //     System.out.print("yes");
        //  else
        //  System.out.println("no");
                if(subSet(arr1, arr2, m, n))
                System.out.print("yes");
            else
            System.out.println("no");
    
        }
    }
    //if the subset contains same frequency as main array.
    public static boolean checkIfSubset(int arr1[], int arr2[], int m, int n ){

        HashMap<Integer, Integer> map =new HashMap<>();

        for(int i =0; i<m; i++){
            map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
        }
        for(int i =0; i<n; i++){
            if(!map.containsKey(arr2[i])){
                return false;
            }
            else{
                if(map.containsKey(arr2[i]))
                map.put(arr2[i], map.get(arr2[i])-1);
                if(map.get(arr2[i])==0)
                map.remove(arr2[i]);
            }
        }
        // System.out.println(map);
        return true;


    }

public static boolean subsetOfArray(int arr1[], int arr2[], int m, int n) {
    HashSet<Integer> set = new HashSet<>();
    for(int i : arr1)
    set.add(i);
    for(int e : arr2){
        if(!set.contains(e))
        return false;
    }
    return true;
}

public static boolean subSet(int arr[], int brr[], int m, int n){

    Set<Integer> set = new HashSet<>();
    for(int i=0; i<m; i++){
        set.add(arr[i]);
    }
    int size = set.size();
    //after adding second array in set, set size must be same.
    for(int i=0; i<n; i++)
    set.add(brr[i]);

    if(size==set.size())
    return true;

    return false;
}
}



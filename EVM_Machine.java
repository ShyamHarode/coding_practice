import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// Sample Input
// 4
// 12678345 BJP
// 57891082 Congress
// 12678345 AAP
// 65489 TMC

// Sample Output
// BJP 1
// Congress 1
// TMC 1

public class EVM_Machine {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();

		//Using TreeMap to print ans in lexographical order
		TreeMap<String, Integer> map = new TreeMap<>();
		HashSet<String> set = new HashSet<>();

		for(int i = 0; i < n; i++) {

			String id = sc.next();

			String party = sc.next();

			if(!set.contains(id)) {
				map.put(party, map.getOrDefault(party, 0) + 1);
				set.add(id);
			}
		}

		int maxValue = Collections.max(map.values());
		for(Map.Entry <String, Integer> i : map.entrySet()) {
			if(i.getValue() == maxValue) {
				System.out.println(i.getKey() + " " + i.getValue());
			}
		}
	}
}
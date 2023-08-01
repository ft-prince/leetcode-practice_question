class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
         List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
		printsubset(arr, 0, ll, ans);
      return ans;
    }
       
public static void printsubset(int[] arr, int idx, List<Integer> list, List<List<Integer>> ans) {
		// System.out.println(ll);
		// ans.add(new ArrayList<Integer>(ll));
		// for (int i = idx; i < arr.length; i++) {
        //         if(i!=idx&&arr[i]==arr[i-1]){
        //     continue ;
        //   }
		// 	ll.add(arr[i]);
		// 	PrintSubSet(arr, i + 1, ll, ans);
		// 	ll.remove(ll.size() - 1);

		// }
 ans.add(new ArrayList<Integer>(list));
for(int i=idx;i<arr.length;i++){
    if(i!=idx &&arr[i]==arr[i-1]){
        continue;
    }
    		 	list.add(arr[i]);
		 	printsubset(arr, i +1, list, ans);
			list.remove(list.size() - 1);
}

    }
    
}
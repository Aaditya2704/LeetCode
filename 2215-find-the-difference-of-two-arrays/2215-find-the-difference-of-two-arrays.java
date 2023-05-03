class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int i:nums1)set1.add(i);
        for(int i:nums2)set2.add(i);
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        for(int num : set1){  
			if(!set2.contains(num)){ list.get(0).add(num); } 
		}
		for(int num : set2){ 
			if(!set1.contains(num)){ list.get(1).add(num); } 
		}
		return list;
    }
}
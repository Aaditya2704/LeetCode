class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hash = new HashSet<>();
        int zero = 0;
        for(int itr : arr){
            if(itr==0) zero++;
            hash.add(itr);
        }
        if(zero>=2){
            return true;
        }
        hash.remove(0);
        for(int itr : arr){
            if(hash.contains(2*itr)) return true;
        }
        return false;
    }
}
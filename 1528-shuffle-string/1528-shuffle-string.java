class Solution {
    public String restoreString(String s, int[] indices) {
       TreeMap<Integer,Character>tree=new TreeMap<Integer,Character>();
        for(int i=0;i<indices.length;i++){
            tree.put(indices[i],s.charAt(i));
        }
        String str ="";
        for(Map.Entry m:tree.entrySet()){
            str+=m.getValue();
        }
        return str;
    }
}
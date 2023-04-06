class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer,Character>mp=new HashMap<Integer,Character>();
        for(int i=0;i<indices.length;i++){
            mp.put(indices[i],s.charAt(i));
        }
        ArrayList<Integer> sortByKey=new ArrayList<Integer>(mp.keySet());
        Collections.sort(sortByKey);
        
        StringBuffer sb = new StringBuffer();
        for(Map.Entry m:mp.entrySet())
            sb.append(m.getValue());
      String str = sb.toString();
        return str;
    }
}
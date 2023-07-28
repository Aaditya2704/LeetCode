class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
         HashMap<String,Integer>map=new HashMap<>();
        
        String arr[]=new String[list1.length];
        ArrayList<String>ls=new ArrayList<>();
  
        int leastsum=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++)
        {
            map.put(list1[i],i);
        }
        for(int j=0;j<list2.length;j++)
        {
            if(map.containsKey(list2[j]))
            {
                int i=map.get(list2[j]);
               int sum=i+j;
                if(sum<leastsum)
                {
                    ls.clear();
                    leastsum=sum;
                    ls.add(list2[j]);
                }else if(sum==leastsum){
                    ls.add(list2[j]);
                }
            }
        }
        return ls.toArray(new String[ls.size()]);

    }
}
class Solution {
    private void dfs(int [][] graph,int city,boolean[]visited){
        if(visited[city])return;
        visited[city]=true;
        for(int i=0;i<graph.length;i++){
            if(graph[city][i]==1)dfs(graph,i,visited);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        boolean[]visited=new boolean[isConnected.length];
        int count=0;
        for(int i=0 ;i<isConnected.length;i++){
            if(!visited[i]){
                count++;
                dfs(isConnected,i,visited);
            }
        }
        return count;
    }
}
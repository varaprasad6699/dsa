class Solution
{
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        ArrayList<Integer> arr =new  ArrayList<Integer>();
       
      boolean[]  over =new boolean[V];
        
        dfs(0,arr,over,adj);
        
        return arr;
    }
        
        void dfs(int v,ArrayList<Integer> arr,boolean[]  over,ArrayList<ArrayList<Integer>> adj){
        
        arr.add(v);
        over[v]=true;
        for (Integer value:adj.get(v)){
            if (!over[value]){
                dfs(value,arr,over,adj);
            }
        }
    }
    
}

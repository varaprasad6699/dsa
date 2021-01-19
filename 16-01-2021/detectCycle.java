class Solution
{
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean[] visited = new boolean[V];
       for (int u=0;u<V;u++){ 
           if(!visited[u]){
              if(detectCycle(u,-1,adj,visited))
                   return true;
          }
       }
       return false;
                 
       
    }
        
       
    
public boolean detectCycle(int neighbour ,int parent,ArrayList<ArrayList<Integer>> adj,boolean[] visited){
       
       
        visited[neighbour]=true;
        for ( Integer i: adj.get(neighbour)){
            if(!visited[i]){
                if ( detectCycle(i,neighbour,adj,visited))
                    return true;
            }
            else if( parent != i){
                    return true;
                   
                }
               
                       
        }
        return false;
    }
}

class Solution
{
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        ArrayList<Integer> arr =new  ArrayList<Integer>();
       
      boolean[]  over =new boolean[V];
        
        bfs(0,arr,over,adj);
        
        return arr;
    }
    void bfs(int v,ArrayList<Integer> arr,boolean[]  over,ArrayList<ArrayList<Integer>> adj){
        
        LinkedList<Integer> queue =new   LinkedList<Integer>();
        queue.add(v);
        over[v]=true;
        while( queue.size()!=0){
           int first_element= queue.poll();
           arr.add(first_element);
           for (Integer value:adj.get(first_element)){
            if (!over[value]){
               queue.add(value);
                over[value]=true;
            }
        }
            
        }
        
    }
    
}

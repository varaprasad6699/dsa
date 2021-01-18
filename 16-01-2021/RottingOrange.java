class Index{
    int r,c;
    Index(int i, int j){
        this.r=i;
        this.c=j;
    }
}


class Solution {
    public boolean isSafe(int i,int j,int row, int col){
        if(i>=0 && j>=0 && i<row && j<col) {
            return true;
        }
    return false;
    }
    public int orangesRotting(int[][] grid) {
        int[] row_direction={-1,0,1,0};
        int[] col_direction={0,1,0,-1};
      LinkedList<Index> queue = new LinkedList<>();
      for (int i=0;i<grid.length;i++){
          for (int j=0;j<grid[0].length;j++){
              if (grid[i][j]==2){
                  queue.add(new Index(i,j));
              }
          }
      } 
    
    int time_taken=-1;
    while(!(queue.isEmpty())){
        int size=queue.size();
        time_taken++;
        
        for(int i=0;i<size;i++){
            Index curr=queue.removeFirst();
            for(int direction=0;direction<4;direction++){
             int   row=curr.r+row_direction[direction];
              int  col=curr.c+col_direction[direction];
            if(isSafe(row,col,grid.length,grid[0].length) &&grid[row][col]==1 ){
                grid[row][col]=2;
                queue.add(new Index(row,col));
                
            }
            }
        }
    }
         boolean con=true;
    for (int i=0;i<grid.length;i++){
    for (int j=0;j<grid[0].length;j++){
        if (grid[i][j]==1){
               con=false;
                return -1;
             
              }
       
          }
     
      }
    if (con && time_taken==-1 )
        return 0;
    return  time_taken;   
    }
}

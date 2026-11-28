class Solution {
public void dfs( int node , int [][] isconnected , boolean[] visited){

visited[node] = true;
for( int j = 0 ; j < isconnected.length ; j++){
    if( isconnected[node][j] == 1 && !visited[j]){

        dfs(j , isconnected , visited);
    }
}
}
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;

        boolean []visited = new boolean[n];
        int provinces = 0;
            for (int i = 0; i < n; i++) {
        if( !visited[i]){
            provinces++;

            dfs(i , isConnected, visited);
        }
            }
        return provinces;
    }
    
}
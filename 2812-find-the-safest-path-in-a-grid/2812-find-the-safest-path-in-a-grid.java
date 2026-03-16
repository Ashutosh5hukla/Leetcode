import java.util.*;

class Solution {

    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    int n;

    public int maximumSafenessFactor(List<List<Integer>> grid) {

        n = grid.size();

        int[][] dist = new int[n][n];
        for(int[] d: dist) Arrays.fill(d, -1);

        Queue<int[]> q = new ArrayDeque<>();

        // push all thieves
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid.get(i).get(j)==1){
                    q.add(new int[]{i,j});
                    dist[i][j] = 0;
                }
            }
        }

        // BFS for nearest thief distance
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];

            for(int[] d: dir){
                int nx = x + d[0];
                int ny = y + d[1];

                if(nx>=0 && ny>=0 && nx<n && ny<n && dist[nx][ny]==-1){
                    dist[nx][ny] = dist[x][y] + 1;
                    q.add(new int[]{nx,ny});
                }
            }
        }

        int l = 0, r = n*n, ans = 0;

        while(l<=r){
            int mid = l + (r-l)/2;

            if(check(dist, mid)){
                ans = mid;
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }

        return ans;
    }

    boolean check(int[][] dist, int val){

        if(dist[0][0] < val) return false;

        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] vis = new boolean[n][n];

        q.add(new int[]{0,0});
        vis[0][0] = true;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];

            if(x==n-1 && y==n-1) return true;

            for(int[] d: dir){
                int nx = x + d[0];
                int ny = y + d[1];

                if(nx>=0 && ny>=0 && nx<n && ny<n &&
                   !vis[nx][ny] && dist[nx][ny] >= val){

                    vis[nx][ny] = true;
                    q.add(new int[]{nx,ny});
                }
            }
        }

        return false;
    }
}
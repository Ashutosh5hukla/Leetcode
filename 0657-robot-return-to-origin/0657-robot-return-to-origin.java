class Solution {
    public boolean judgeCircle(String str) {
        int x=0;
        int y=0;
        for(char ch: str.toCharArray()){
            if(ch=='U')x++;
            else if(ch=='D')x--;
            else if(ch=='R')y++;
            else y--;
        }
        return x==0 && y==0;
    }
}
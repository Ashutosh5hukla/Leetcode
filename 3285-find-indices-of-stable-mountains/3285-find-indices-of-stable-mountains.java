class Solution {
    public List<Integer> stableMountains(int[] height, int th) {
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=1;i<height.length;i++){
            if(height[i-1]>th){
                ls.add(i);
            }
        }
        return ls;
    }
}
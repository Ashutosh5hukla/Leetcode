class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
          int idx=Math.abs(arr[i])-1;
          if(arr[idx]>0){
            arr[idx]*=-1;
          }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }
}
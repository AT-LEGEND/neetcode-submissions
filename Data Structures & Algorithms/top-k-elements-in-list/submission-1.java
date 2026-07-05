class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer>[] arr = new ArrayList[nums.length+1];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i <nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key: map.keySet())
        {
            if(arr[map.get(key)]==null)
                arr[map.get(key)] = new ArrayList<>();
            arr[map.get(key)].add(key);
            
        }
        int[] ans = new int[k];
        int idx = 0;
        for(int i=arr.length - 1 ;i>=0 && idx < k;i--)
        {
            if(arr[i]!=null)
            {
                for(int num: arr[i])
                {
                    ans[idx++]=num;
                    if(idx==k)
                        return ans;
                }
            }
        }
        return ans;
    }
}
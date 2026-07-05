class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(map.keySet());
        int ref = arr.get(0);
        int count=1;
        int max=0;
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i) + " ");
        }
        for(int i=1;i<arr.size();i++)
        {
            System.out.println(arr.get(i) + " " + ref + " " + count);
            if(arr.get(i)-ref==1)
            {
                count++;
                ref=arr.get(i);
            }
            else
            {
                ref=arr.get(i);
                max=Math.max(max,count);
                count=1;
            }
        }
        max=Math.max(max,count);
        return max;
    }
}

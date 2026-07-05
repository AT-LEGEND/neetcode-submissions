class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }
        int max=0;
        for(int i: s)
        {
            //System.out.println(arr.get(i) + " " + ref + " " + count);
            if(!s.contains(i-1))
            {
                int curr = i;
                int str = 1;
                while(s.contains(curr+1))
                {
                    curr++;
                    str++;
                }
                max=Math.max(max,str);
            }

        }
        return max;
    }
}

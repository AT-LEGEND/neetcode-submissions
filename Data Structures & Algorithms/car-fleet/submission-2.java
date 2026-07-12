class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Float> st = new Stack<>();
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for(int i = 0;i<position.length;i++)
        {
            mp.put(position[i], speed[i]);
        }
        for(int key: mp.keySet())
        {
            int rem = target-key;
            float time = (float)rem/mp.get(key);
            st.push(time);
        }
        int count=0;
        while(!st.isEmpty())
        {
            //System.out.println(st);
            float ref = st.peek();
            while(!st.isEmpty() && ref>=st.peek())
            {
                st.pop();
                //System.out.println(st);
            }
            count+=1;
        }
        return count;
    }
}










































































































































































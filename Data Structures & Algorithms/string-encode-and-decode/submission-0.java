class Solution {

    public String encode(List<String> strs) {
        StringBuilder st = new StringBuilder("");
        for(String s: strs)
        {
            st.append(s.length());
            st.append('#');
            st.append(s);
        }
        return st.toString();
    }

    public List<String> decode(String str) {
        //System.out.println(str);
        int idx = 0;
        List<String> ans = new ArrayList<>();
        while(idx<str.length())
        {
            int num=0;
            while(str.charAt(idx)!='#')
            {
                //System.out.println(num);
                num = num*10 + (int)(str.charAt(idx)-'0');
                idx++;
            }
            int start = idx+1;
            //System.out.println(str + "  " + start + " " + num);

            ans.add(str.substring(start,start + num));
            idx+=num+1;
        }
        return ans;
    }
}

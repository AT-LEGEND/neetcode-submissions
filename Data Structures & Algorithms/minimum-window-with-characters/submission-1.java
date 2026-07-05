class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
            return "";
        Map<Character, Integer> mp = new HashMap<>();
        for(int i =0;i<t.length();i++)
        {
            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
        }
        if(mp.size()>s.length())
            return "";
        int count =mp.size();
        int i=0,j=0;
        int iref=-1, jref=-1, len=Integer.MAX_VALUE;
        while(j<s.length())
        {
            if(mp.containsKey(s.charAt(j)))
            {
                int freq =mp.get(s.charAt(j));
                mp.put(s.charAt(j),freq-1);
                if(freq==1)
                    count--;
            }
            System.out.println(count + " " + i + " " + j);
            while(count==0 && i<s.length())
            {
                if(len>j-i+1)
                {
                    iref=i;
                    jref=j;
                    len=j-i+1;
                    System.out.println(len);
                }
                if(mp.containsKey(s.charAt(i)))
                {
                    int freq =mp.get(s.charAt(i));
                    mp.put(s.charAt(i),freq+1);
                    if(freq==0)
                        count++;
                }
                i++;
            }
            j++;

        }
        if(iref!=-1 || jref!=-1)
            return s.substring(iref,jref+1);
        else
            return "";

    }
}

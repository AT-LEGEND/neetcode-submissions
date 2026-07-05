class Solution {
    public boolean checkInclusion(String pat, String txt) {
        // code here
        int length = pat.length();
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<length;i++)
        {
            map.put(pat.charAt(i),map.getOrDefault(pat.charAt(i),0)+1);
        }
        int count=0;
        int i=0,j=0;
        while(i<=j && j<txt.length())
        {
            map2.put(txt.charAt(j),map2.getOrDefault(txt.charAt(j),0)+1);
            if(j-i+1==length)
            {
                if(map2.equals(map))
                    return true;
                map2.put(txt.charAt(i),map2.get(txt.charAt(i))-1);
                if(map2.get(txt.charAt(i))==0)
                    map2.remove(txt.charAt(i));
                i++;
            }
            j++;
        }
        return false;
    }
}

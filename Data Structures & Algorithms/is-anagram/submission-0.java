class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String s1 = new String(arr1);
        String t1 = new String(arr2);
        if(s1.equals(t1))
            return true;
        else
            return false;
    }
}

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();

        for(int i=0;i<a1.length;i++){
            if(mapS[a1[i]]!=mapT[a2[i]]){
            return false;
            }
            mapS[a1[i]] = i+1;
            mapT[a2[i]] =i+1;
        }
        return true;
    }
}
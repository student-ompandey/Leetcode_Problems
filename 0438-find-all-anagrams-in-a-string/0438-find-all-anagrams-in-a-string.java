class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length()-1;
        int m = p.length();
        int[] freq = new int[26];
        List<Integer> ans = new ArrayList<>();

        for (char ch : p.toCharArray()) {
            freq[ch - 'a']++;
        }

        int left = 0;
        for(int right=0;right<=n;right++){
            freq[s.charAt(right)-'a']--;

            if(right-left+1>m){
                freq[s.charAt(left)-'a']++;
                left++;
            }

            if(right-left+1==m){
                boolean isAnagram = true;
                for(int a : freq){
                    if(a != 0){
                        isAnagram = false;
                        break;
                    }
                }
                if(isAnagram){
                ans.add(left);
            }
            }
            
       
}
 return ans;
}
}
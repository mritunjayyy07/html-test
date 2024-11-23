class Solution {
    public String longestPalindrome(String s) {
        int len  = s.length();
        String ans = "";
        int maxlen = 0 ;
        for(int mid = 0 ; mid < len ; mid++)
        {
            int i = mid - 1;
            int j = mid + 1;
            int curlen = 1 ;
            while ( i >= 0 && j < len && s.charAt(i) == s.charAt(j))
            {
                j++;
                i--;
                curlen += 2;
                
            }
            if(curlen > maxlen)
            {
                ans = s.substring(i+1, j );
                maxlen = curlen;
            }
            
                
            
        }
        for(int mid = 0 ; mid < len-1; mid ++)
        {
            int i = mid;
            int j = mid + 1;
             int curlen = 0 ; 
            while(i >= 0 && j < len && s.charAt(i) == s.charAt(j))
            {
                i--;
                j++;
                curlen +=2;
                
            }
            if(curlen > maxlen)
            {
                ans = s.substring(i+1,j);
                maxlen= curlen;
                    
            }
        }
        return ans;
        
        
    }
}
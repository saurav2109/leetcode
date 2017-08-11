public class Solution {
    public boolean isMatch(String s, String p) {
        int dp[][] = new int[100][100];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp);    
        }
        
        return isMatch(s,p,0,0,dp);
    }
    
    boolean isMatch(String s, String p, int i, int j, int dp[][]){
        
   
        
    }
}
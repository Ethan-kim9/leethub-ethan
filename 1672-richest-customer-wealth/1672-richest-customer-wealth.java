class Solution {
	    public int maximumWealth(int[][] accounts) {       
		int m = accounts.length;
		int n = accounts[0].length;
		int output = 0;
 
		for(int i=0; i<m; i++) {
			int tmp = 0;
 
			for(int j=0; j<n; j++) 
				tmp += accounts[i][j];
 
			output = Math.max(output, tmp);
		}
 
		return output;
    }
}
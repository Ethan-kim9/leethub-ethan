class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE; 
        double s = 0.0;
        for (int i = 0; i < salary.length; ++i) {
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
            s += salary[i];
        }
        
        return (s - min - max) / (salary.length - 2);
    }
}
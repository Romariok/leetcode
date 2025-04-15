class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> target = new ArrayList<>();
        int[] prev = null;
        for(int[] interval: intervals){
            if(prev != null){
                if(interval[0] <= prev[1]){
                    if (interval[1] >prev[1])
                        prev[1] = interval[1];
                }
                else{
                    target.add(prev);
                    prev = interval;
                }
            }
            else
                prev = interval;
        }
        target.add(prev);
        return target.toArray(new int[target.size()][]);
    }
}
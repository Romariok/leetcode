class Solution {
    private void recGenerate(List<String> resultList, int left, int right, String cur){
        if (left == 0 && right == 0){
            resultList.add(cur);
        }
        else{
            if (left>0){
                recGenerate(resultList, left-1, right, cur+"(");
            }
            
            if (left<right){
                recGenerate(resultList, left, right-1, cur+")");
            }
        }
        

    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        recGenerate(result, n-1, n, "(");
        return result;
    }
}
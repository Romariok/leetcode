public class Solution {
    public static String sortString(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<String, List<String>>();
        for (String str: strs){
            String sortedStr = sortString(str);
            if (!groups.containsKey(sortedStr)){
                List<String> newList = new ArrayList<String>();
                newList.add(str);
                groups.put(sortedStr, newList);
            }
            else{
                List<String> tmpList = groups.get(sortedStr);
                tmpList.add(str);
                groups.put(sortedStr, tmpList);
            }
        }
        return new ArrayList<List<String>>(groups.values());
    }
} {
   
}

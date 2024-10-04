class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map= new HashMap<>();
        List<List<String>> res= new ArrayList<>();
        for(String str:strs){
            String key=findKey(str.toCharArray());
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        for(List<String> r:map.values()){
            res.add(r);
        }
        return res;
    }
    private String findKey(char[] ch){
        Arrays.sort(ch);
        return new String(ch);
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<HashMap<Character,Integer>, List<String>> map = new HashMap<>();
  
        for(int i=0;i<=strs.length-1;i++){
          HashMap<Character,Integer> countMap = new HashMap<>();
          for(int j=0;j<=strs[i].length()-1;j++){
            if(countMap.containsKey(strs[i].charAt(j)))
              countMap.put(strs[i].charAt(j),countMap.get(strs[i].charAt(j))+1);
            else
              countMap.put(strs[i].charAt(j),1);
          }

          if(map.containsKey(countMap)){
            map.get(countMap).add(strs[i]);
          }else{
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            map.put(countMap, group);
          }
        }
  
        return new ArrayList<>(map.values());
      }
}

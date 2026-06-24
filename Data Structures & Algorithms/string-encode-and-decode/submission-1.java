class Solution {

    public String encode(List<String> strs) {

        String encodedStr="";
        for (String item : strs) {
          //  System.out.println(item.length() + "---" + item);
            encodedStr= encodedStr + item.length() + "#"+ item;
        }
        return encodedStr;
    }

    public List<String> decode(String str) {
        List<String> decodedStrs = new ArrayList<>();
        int i = 0;
        while (i <= str.length() - 1) {
            int count = 0;
            while (str.charAt(i) != '#') {
                count = count * 10 + (str.charAt(i) - '0');
                i++;
            }
            i++;
            String res = str.substring(i, i + count);
            i += count;
            decodedStrs.add(res);
        }
        return decodedStrs;
    }
}

class Solution {
    public List<String> printVertically(String s) {
        List<String>res = new ArrayList();
        String str[] = s.split(" ");
        int max = 0;
        for(String x:str){
            max = Math.max(max,x.length());
        }
        int j=0;
        while(j<max){
            String temp = "";
            for(String c:str){
                if(j<c.length()){
                    temp+=c.charAt(j);
                }
                else{
                    temp+=" ";
                }
            }
            j++;
            res.add(temp.replaceFirst("\\s++$",""));
        }
        return res;
    }
}
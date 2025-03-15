class Solution {
    public String toGoatLatin(String sentence) {
        String [] result = sentence.split(" ");
        String result1 = "";
        for(int i=0;i<result.length;i++){
            String check = result[i].toLowerCase();
            if(check.charAt(0) == 'a' || check.charAt(0) == 'e' ||
            check.charAt(0) == 'i' || check.charAt(0) == 'o' ||
            check.charAt(0) == 'u') {
                result[i] += "ma";
            } else {
                char a = result[i].charAt(0);
                result[i] = result[i].replaceFirst(""+a,"");
                result[i] += a+"ma"; 
            }

            
        }
        for(int j=0;j<result.length;j++){
                result[j] +="a".repeat(j+1);
            }

        for(String i : result){
            result1 += i + " " ;
        }
        result1 = result1.substring(0, result1.length()-1);
    return result1;
    }
}
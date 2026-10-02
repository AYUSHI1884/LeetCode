class Solution {
    public List<Integer> findAnagrams(String text, String pattern) {
        
        List <Integer> result= new ArrayList<>();
        for(int i=0;i<text.length()-pattern.length()+1;i++){
            String sub=text.substring(i,i+pattern.length());
            if (isAnagram(sub,pattern)){
            result.add(i);
        }
        }
    return result;
    }
    
public boolean isAnagram(String s, String p){
    if (s.length()!=p.length()){
        System.out.println("Not Anagram");
        return false;
    }

    int[] result=new int[26];
    for(int i=0; i<s.length();i++){
        result[s.charAt(i)-'a']++;
        result[p.charAt(i)-'a']--;
    }

    for(int i=0;i<26;i++){
        if(result[i]!=0){
            System.out.println("Not Anagram");
            return false;
        }
    }
    System.out.println("Anagram");
    return true;

}



}
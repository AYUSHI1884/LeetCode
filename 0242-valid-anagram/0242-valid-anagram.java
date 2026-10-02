class Solution {
    public boolean isAnagram(String s, String t) {
        // s="anagram";
        // t="nagaram";

        // Scanner sc=new Scanner(System.in);
        // s=sc.next();
        // t=sc.next();

        if (s.length()!=t.length()){
            System.out.println("Not Anagram ");
            return false;
        }

        int count[]=new int[26];

        for (int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            if(count[i]!=0){
                System.out.println("Not an Anagram");
                return false;
            }  
        }
        System.out.println("Anagram");
        return true;
    }
}
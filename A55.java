class Solution {
    public boolean halvesAreAlike(String s) {
        int length = s.length();
        int mid = length / 2;
        
        String first = s.substring(0, mid);
        String second = s.substring(mid);
        
        int count1 = 0;
        int count2 = 0;
        
        for (char ch : first.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count1++;
            }
        }
        
        for (char ch : second.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count2++;
            }
        }
        
        return count1 == count2;
    }
}

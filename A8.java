class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++)
        {
            String sentence = sentences[i];
            String words[] = sentence.split(" ");
            int wordsCount = words.length;
            
            if(wordsCount > max) {
                max = wordsCount;
            }
        }
        return max;
    } 
}

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            indexMap.put(list1[i], i);
        }
        int minIndexSum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();

        for (int j = 0; j < list2.length; j++) {
        
            if (indexMap.containsKey(list2[j])) {
            
                int indexSum = j + indexMap.get(list2[j]);
                if (indexSum < minIndexSum) {
                    minIndexSum = indexSum;
                    result.clear(); 
                    result.add(list2[j]);
                } else if (indexSum == minIndexSum) {
                 
                    result.add(list2[j]);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}

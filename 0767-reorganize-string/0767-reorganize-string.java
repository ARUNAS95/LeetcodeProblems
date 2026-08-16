class Solution {
    public String reorganizeString(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        Character previous = null;
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());

        while(!pq.isEmpty()){
            Character c= pq.poll();
            sb.append(c);

            map.put(c, map.get(c) -1);

            if(previous!=null && (map.get(previous) >0)){
                pq.offer(previous);
            }

            if(map.get(c)>0){
                previous = c;
            } else {
                previous = null;
            }
        }

        if(sb.length() != s.length()){
            return "";
        }

        return sb.toString();
    }
}
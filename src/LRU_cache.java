class LRUCache {
    int capacity;
    LinkedHashMap<Integer,Integer> map;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<Integer,Integer>(capacity,0.75f,true);
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            return map.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.size()>=capacity || !map.containsKey(key)){
           int firstKey = map.keySet().iterator().next();
           map.remove(firstKey);
        }else{
            map.put(key,value);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

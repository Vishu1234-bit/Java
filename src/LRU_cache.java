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
class LRUCache:

    def __init__(self, capacity: int):
        self.capacity = capacity
        self.cache = OrderedDict()

    def get(self, key: int) -> int:
        if(key in self.cache):
            self.cache.move_to_end(key)
            return self.cache[key]
        return -1

    def put(self, key: int, value: int) -> None:
        if(key in self.cache):
            self.cache.move_to_end(key)
        self.cache[key]=value
        if(len(self.cache)>self.capacity):
            self.cache.popitem(last=False)
            


# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache(capacity)
# param_1 = obj.get(key)
# obj.put(key,value)
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

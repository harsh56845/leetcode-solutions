class MyHashMap {
    int[] frq;
    public MyHashMap() {
        frq = new int[1000001];
        Arrays.fill(frq,-1);
    }
    
    public void put(int key, int value) {
        frq[key] = value;
    }
    
    public int get(int key) {
        return frq[key];
    }
    
    public void remove(int key) {
        frq[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
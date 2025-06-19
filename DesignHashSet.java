class MyHashSet {

    private final int Size = 10000;
    private LinkedList<Integer>[] buckets;

    public MyHashSet() {
        buckets = new LinkedList[Size];
        for(int i = 0; i < Size; i++){
            buckets[i] = new LinkedList<Integer>();
        }
    }

    public int hash(int key){
        return key % Size;
    }
    
    public void add(int key) {
        int index = hash(key);
        if(!buckets[index].contains(key)){
            buckets[index].add(key);
        }
       }
    
    public void remove(int key) {
        int index = hash(key);
        if(buckets[index].contains(key)){
            buckets[index].remove(Integer.valueOf(key));
        }
     }
    
    public boolean contains(int key) {
        int index = hash(key);
        return buckets[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);

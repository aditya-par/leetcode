class FreqStack {

    Map<Integer, Integer> map = null;
    List<Stack<Integer>> stList = null;
    
    public FreqStack() {
        map = new HashMap<>();
        stList = new ArrayList<>();
    }
    
    public void push(int val) {
        map.put(val, map.getOrDefault(val, 0) + 1);
        int freq = map.get(val);
        if(freq - 1 >= stList.size()) {
            stList.add(new Stack<Integer>());
        }
        stList.get(freq-1).push(val);
    }
    
    public int pop() {
        int size = stList.size();
        int x = stList.get(size - 1).pop();
        if(stList.get(size-1).empty()) {
            stList.remove(size-1);
        }
        
        map.put(x, map.get(x) -1);
        if(map.get(x) == 0) {
            map.remove(x);
        }
        return x;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
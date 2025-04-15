class RandomizedSet {
    ArrayList<Integer> list;
    Random random = new Random();
    HashMap<Integer, Integer> map;
    
    public RandomizedSet() {
        list = new ArrayList<Integer>();
        map = new HashMap<Integer, Integer>();
    }
    
    public boolean insert(int val) {
        if(map.get(val) != null)
            return false;
        list.add(val);
        map.put(val, list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(map.get(val) == null)
            return false;

        int index = map.get(val);
        int lastval = list.get(list.size()-1);
        list.set(index, lastval);
        map.put(lastval, index);

        map.remove(val);
        list.remove(list.size()-1);
        return true;
    }
    
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
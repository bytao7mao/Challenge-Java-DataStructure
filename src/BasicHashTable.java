/**
 * Created by taoLen on 4/26/2018.
 */
public class BasicHashTable<X, Y> {
    private HashEntry[] data;
    private int capacity;
    public BasicHashTable(int tableSize){
        this.capacity = tableSize;
        this.data = new HashEntry[this.capacity];
    }
    private class HashEntry<X, Y>{
        private Y value;
        private X key;

        public HashEntry(X key) {
            this.key = key;
        }
        public HashEntry(X key,Y value) {
            this.key = key;
            this.value = value;
        }

        public X getKey(){return key;}
        public void setKey(X key){this.key = key;}
    }

}

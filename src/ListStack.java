import java.util.ArrayList;

/**
 * Created by taoLen on 4/25/2018.
 */
public class ListStack<X> {
    private ArrayList<X> data;
    private int stackPointer;
    public ListStack(){
        data =  new ArrayList<>(1000);
        stackPointer = 0;
    }
    public void push(X newItem){
        data.set(stackPointer++, newItem);
    }
    public X pop() {
        if (stackPointer == 0) {
            throw new IllegalStateException("No more items");
        }
        return data.get(--stackPointer);
    }
    public boolean contains(X item){
        boolean found = false;

        for (int i = 0; i < stackPointer; i++) {
            if(data.get(i).equals(item)){
                found = true;
                break;
            }
        }
        return found;
    }
    public X access(X item) {

        while(stackPointer > 0){
            X tmpItem = pop();
            if(item.equals(tmpItem)){
                return tmpItem;
            }
        }
        throw new IllegalArgumentException("Could not find item" + item);
    }
    public int size(){
        return stackPointer;
    }
}

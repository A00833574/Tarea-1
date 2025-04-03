import java.util.ArrayList;
import java.util.NoSuchElementException;

class Queue<T> {
    ArrayList<T> items;

    public Queue() {
        this.items = new ArrayList<T>();
    }

    public boolean isEmpty() {
        return (this.items.isEmpty());
    }

    public void offer(T item) {
        this.items.add(item);
    }

    public T poll() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        return this.items.remove(0);
    }

    public T peek() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        return this.items.get(0);
    }

    public T get(int i) {
        if (this.isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        return this.items.get(i);
    }

    public void update(int i, T new_value){
        if (this.isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        this.items.set(i, new_value);
    }

    public int size() {
        return this.items.size();
    }

}
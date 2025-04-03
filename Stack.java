import java.util.ArrayList;
import java.util.NoSuchElementException;

class Stack<T> {
    ArrayList<T> items;

    public Stack() {
        this.items = new ArrayList<T>();
    }

    public boolean isEmpty() {
        return (this.items.isEmpty());
    }

    public void push(T item) {
        this.items.add(item);
    }

    public T pop() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        return this.items.remove(items.size() - 1);
    }

    public T peek() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        return this.items.get(items.size() - 1);
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
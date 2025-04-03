public class DemoEstructuras {
    public static void main(String[] args) {
        
        System.out.println("=== Stack ===");
        
        Stack<Integer> stack = new Stack<>();
        System.out.println("Test 1: Stack vacío -> " + stack.isEmpty());
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Test 2: Después de push(10, 20, 30), tamaño = " + stack.size());
        
        System.out.println("Test 3: Peek del Stack (debe ser 30) -> " + stack.peek());
        
        int popped = stack.pop();
        System.out.println("Test 4: pop() -> " + popped + ", tamaño actual = " + stack.size());
        
        stack.update(0, 99);
        System.out.println("Test 5: update(0, 99) -> valor en índice 0 es " + stack.get(0));
        
        System.out.println("\n=== Queue ===");
        
        Queue<String> queue = new Queue<>();
        System.out.println("Test 1: Queue vacío -> " + queue.isEmpty());
        
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println("Test 2: Después de offer(A, B, C), tamaño = " + queue.size());
        
        System.out.println("Test 3: Peek de la Queue (debe ser A) -> " + queue.peek());
        
        String polled = queue.poll();
        System.out.println("Test 4: poll() -> " + polled + ", tamaño actual = " + queue.size());
        
        queue.update(0, "Z");
        System.out.println("Test 5: update(0, Z) -> valor en índice 0 es " + queue.get(0));
        
        System.out.println("\n=== HashTable ===");
        
        HashTable hashTable = new HashTable();
        hashTable.put(1, "Uno");
        System.out.println("Test 1: put(1, \"Uno\"), get(1) -> " + hashTable.get(1));
        
        hashTable.put(12, "Doce");
        System.out.println("Test 2: put(12, \"Doce\") -> get(1) sigue siendo " + hashTable.get(1) 
                            + ", get(12) -> " + hashTable.get(12));
        
        hashTable.put(1, "UnoNuevo");
        System.out.println("Test 3: put(1, \"UnoNuevo\"), get(1) -> " + hashTable.get(1));
        
        System.out.println("Test 4: get(99) -> " + hashTable.get(99) + " (debe ser null)");
    }
}
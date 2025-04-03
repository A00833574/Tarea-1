public class DemoEstructuras {
    public static void main(String[] args) {
        
        System.out.println("=== Stack ===");
        
        // Test Case 1: Creación y verificación de stack vacío
        Stack<Integer> stack = new Stack<>();
        System.out.println("Test 1: Stack vacío -> " + stack.isEmpty());
        
        // Test Case 2: push() de varios elementos y verificación del tamaño
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Test 2: Después de push(10, 20, 30), tamaño = " + stack.size());
        
        // Test Case 3: peek() del último elemento añadido
        System.out.println("Test 3: Peek del Stack (debe ser 30) -> " + stack.peek());
        
        // Test Case 4: pop() de un elemento
        int popped = stack.pop();
        System.out.println("Test 4: pop() -> " + popped + ", tamaño actual = " + stack.size());
        
        // Test Case 5: update() de un elemento
        stack.update(0, 99);
        System.out.println("Test 5: update(0, 99) -> valor en índice 0 es " + stack.get(0));
        
        System.out.println("\n=== Queue ===");
        
        // Test Case 1: Creación y verificación de queue vacía
        Queue<String> queue = new Queue<>();
        System.out.println("Test 1: Queue vacío -> " + queue.isEmpty());
        
        // Test Case 2: offer() de varios elementos y verificación del tamaño
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println("Test 2: Después de offer(A, B, C), tamaño = " + queue.size());
        
        // Test Case 3: peek() del primer elemento
        System.out.println("Test 3: Peek de la Queue (debe ser A) -> " + queue.peek());
        
        // Test Case 4: poll() para eliminar el primer elemento
        String polled = queue.poll();
        System.out.println("Test 4: poll() -> " + polled + ", tamaño actual = " + queue.size());
        
        // Test Case 5: update() de un elemento
        queue.update(0, "Z");
        System.out.println("Test 5: update(0, Z) -> valor en índice 0 es " + queue.get(0));
        
        System.out.println("\n=== HashTable ===");
        
        // Test Case 1: Inserción (put) de un par clave-valor
        HashTable hashTable = new HashTable();
        hashTable.put(1, "Uno");
        System.out.println("Test 1: put(1, \"Uno\"), get(1) -> " + hashTable.get(1));
        
        // Test Case 2: Manejo de colisiones
        hashTable.put(12, "Doce");
        System.out.println("Test 2: put(12, \"Doce\") -> get(1) sigue siendo " + hashTable.get(1) 
                            + ", get(12) -> " + hashTable.get(12));
        
        // Test Case 3: Actualizar valor con una misma clave
        hashTable.put(1, "UnoNuevo");
        System.out.println("Test 3: put(1, \"UnoNuevo\"), get(1) -> " + hashTable.get(1));
        
        // Test Case 4: Búsqueda de una clave inexistente
        System.out.println("Test 4: get(99) -> " + hashTable.get(99) + " (debe ser null)");
    }
}
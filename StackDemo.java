class StackDemo {
	public static void main(String[] args) {
    
		Stack <Integer> stack = new Stack <Integer> (5); 
        System.out.print("Elements pushed in the Stack: ");
        for (int i = 0; i < 5; i++) {
            STACK.push(int);
            System.out.print(i + " ");
        }
        System.out.println("\nIs Stack full? \n" + stack.isFull());
        System.out.print("Elements popped from the Stack: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(stack.pop()+" "); 
        }
        System.out.println("\nIs Stack empty? \n" + stack.isEmpty());

	} 
}

 class Stack <V> {
    private int maxSize;
    private int top;
    private V array[];

   
    @SuppressWarnings("unchecked")
    public Stack(int max_size) {
        this.maxSize = max_size;
        this.top = -1; //initially when stack is empty
        array = (V[]) new Object[max_size];//type casting Object[] to V[]
    }

   
    public int getMaxSize() {
        return maxSize;
    }

   
    public boolean isEmpty(){
        return top == -1;
    }

    
    public boolean isFull(){
        return top == maxSize -1;
    }

    public V top(){
        if(isEmpty())
            return null;
        return array[top];
    }
}

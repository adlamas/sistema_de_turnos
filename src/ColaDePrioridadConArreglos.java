import java.util.Comparator;


public class ColaDePrioridadConArreglos<Item>  implements QueueInterface<Item> { 
	
	 
	private Item[] q;            // queue elements

    private int N = 0;           // number of elements on queue

    private int first = 0;       // index of first element of queue

    private int last  = 0;       // index of next available slot

// invariante de representación?



    /**

     * Initializes an empty queue.

     */

    public ColaDePrioridadConArreglos() {

        // cast needed since no generic array creation in Java

        q = (Item[]) new Object[2];
        
        

    }

    /**

     * Is this queue empty?

     * @return true if this queue is empty; false otherwise

     */

    public boolean isEmpty() {

        return N == 0;

    }

    /**

     * Returns the number of items in this queue.

     * @return the number of items in this queue

     */

    public int size() {

        return N;

    }

    // resize the underlying array

    private void resize(int max) {

        assert max >= N;

        Item[] temp = (Item[]) new Object[max];

        for (int i = 0; i < N; i++) {

            temp[i] = q[(first + i) % q.length];

        }

        q = temp;

        first = 0;

        last  = N;

    }

    /**

     * Adds the item to this queue.

     * @param item the item to add

     */

    public void enqueue(Item item) {
    	
    	
        if (N == q.length) resize(2*q.length);
    	if(q[0] == null){ q[0] = item; }
        // double size of array if necessary and recopy to front of array
    	
    	if(q[0] != null){
    		int i = 1;
    		
    		
    	}   	  
   // double size of array if necessary

        q[last++] = item;                        // add item

        if (last == q.length) last = 0;          // wrap-around

        N++;

    }

    /**

     * Removes and returns the item on this queue that was least recently added.

     * @return the item on this queue that was least recently added

     * @throws java.util.NoSuchElementException if this queue is empty

     */

    public Item dequeue() throws java.util.NoSuchElementException{

        if (isEmpty()) throw new java.util.NoSuchElementException();

        Item item = q[first];

        q[first] = null;                            // to avoid loitering

        first++;  // preserva el invariante 
        
        N--;

     //   if (first == q.length) throw new java.util.NoSuchElementException();           // wrap-around

        // shrink size of array if necessary

        if (N > 0 && N == q.length/4) resize(q.length/2); 

        return item;

    }

    /**

     * Returns the item least recently added to this queue.

     * @return the item least recently added to this queue

     * @throws java.util.NoSuchElementException if this queue is empty

     */

    public Item peek() throws java.util.NoSuchElementException {

        if (isEmpty()) throw new java.util.NoSuchElementException();

        return q[first];

    }

	
	


}



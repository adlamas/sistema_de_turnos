public interface QueueInterface<Item> {

      public boolean isEmpty();
       // If queue is full, queue is expanded first.

       public void enqueue( Item Item);

       public Item dequeue() throws java.util.NoSuchElementException;   

       public Item peek() throws java.util.NoSuchElementException;

     

    }
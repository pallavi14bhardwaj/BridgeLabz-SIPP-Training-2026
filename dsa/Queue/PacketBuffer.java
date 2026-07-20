package Queue;

public class PacketBuffer {
    private int[] data;
    private int front;
    private int count;

    public PacketBuffer(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    // packet arrives and wants to enter the buffer
    public boolean enqueue(int packetId) {
        // if the buffer is packed, reject the new packet
        if (count == data.length) {
            System.out.println("Buffer full! Dropping packet " + packetId);
            return false; 
        }
        
        // calculate the wrap-around index for the tail using modulo math
        int tail = (front + count) % data.length;
        data[tail] = packetId;
        count++;
        
        System.out.println("Enqueued packet " + packetId);
        return true;
    }

    // packet is pulled off for processing
    public int dequeue() {
        if (count == 0) {
            throw new RuntimeException("Buffer empty, nothing to process!");
        }
        
        int val = data[front];
        // move front pointer forward and wrap around if necessary
        front = (front + 1) % data.length;
        count--;
        
        return val;
    }

    public static void main(String[] args) {
        PacketBuffer buffer = new PacketBuffer(3);
        buffer.enqueue(101);
        buffer.enqueue(102);
        buffer.enqueue(103);
        
        // this one should be dropped because capacity is 3
        buffer.enqueue(104); 
        
        System.out.println("Processing: " + buffer.dequeue());
        
        // now there's room for a new one!
        buffer.enqueue(105); 
        System.out.println("Processing: " + buffer.dequeue());
    }
}

package com.evergent.corejava.io;

import java.nio.ByteBuffer;

public class SimpleBuffer_NIO1 {
    public static void main(String[] args) {
        // Step 1: Create a ByteBuffer with a capacity of 10 bytes
        ByteBuffer buffer = ByteBuffer.allocate(10);
                 // Step 2: Write data into the buffer
        //The put() method is used to write data into the buffer.
        buffer.put((byte) 65);  // ASCII value of 'A'
        buffer.put((byte) 66);  // ASCII value of 'B'
        buffer.put((byte) 67);  // ASCII value of 'C'

        // Step 3: Flip the buffer from write mode to read mode
        buffer.flip();

        // Step 4: Read data from the buffer
        while (buffer.hasRemaining()) {
            byte b = buffer.get();
            System.out.println((char) b);  // Convert byte to char and print it
        }

        // Step 5: Clear the buffer to reuse it (optional)
        buffer.clear();

        // At this point, the buffer is ready to be written into again.
    }
}

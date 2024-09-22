package com.evergent.corejava.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
/*
 Channels are an essential part of Java NIO, providing a connection to 
 entities like files or network sockets that can perform I/O operations.
  Unlike traditional Java I/O, channels allow you to read from or write
   to them asynchronously using buffers.
   FileChannel to read data from a file. 
 */
public class SimpleChannel_NIO2 {
    public static void main(String[] args) {
        // Specify the file path
        //String filePath = "example.txt";
        String filePath = "C:/mydata/example1.txt";
        // Step 1: Create a FileInputStream to read from the file
        try (FileInputStream fis = new FileInputStream(filePath)) {
            
            // Step 2: Get the FileChannel from the FileInputStream
            FileChannel fileChannel = fis.getChannel();
            
            // Step 3: Create a ByteBuffer to hold the data
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            
            // Step 4: Read data from the FileChannel into the buffer
            int bytesRead = fileChannel.read(buffer);
            
            // Step 5: Flip the buffer to prepare it for reading
            buffer.flip();
            
            // Step 6: Read the content of the buffer and print it out
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            
            // Step 7: Clear the buffer if needed (not needed in this simple example)
            buffer.clear();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


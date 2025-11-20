package javalanguage.roadmap.iohandling;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NioReadFile {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\DM2719\\Documents\\personal-workspace\\coding\\src\\demo.txt");

        FileChannel fileChannel = null;

        try {
            fileChannel = FileChannel.open(filePath, StandardOpenOption.READ);
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            StringBuilder content = new StringBuilder();

            System.out.println("Reading from " + filePath + " using java.nio(Channels & Buffers)");
            int bytesRead;

            while((bytesRead = fileChannel.read(buffer)) != -1) {
                buffer.flip();// flip the buffer to prepare for reading from it
                content.append(StandardCharsets.UTF_8.decode(buffer)); //Decode bytes to characters
                buffer.clear();//clear the buffer for the next read operations
            }

            System.out.println(content.toString());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }


    }
}

package IO_Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    // read this comments
    // Read this comments
    // I/O Streams : An I/O Stream represents an input source or an output destination.
    // Generally I/O means taking input from some internal source and sending output to some destination.
    // Streams : The way of transferring data from input source to destination is done by Streams.
    // Streams converts the data into Binary form and send to destination program.
    // Input Streams : A program uses an input stream to read data from a source one at a time.
    // e.g : data source -> streams -> program
    // Output Streams : A program uses an output stream to write data to a destination, one item at time.
    // e.g : program -> streams -> data source.
    // Java Provide Predefined classes for performing Input and Output Streams, such as

    // InputStream -> FileInputStream (-> extends)
    // OutputStream -> FileOutputStream
    // Reader -> InputStreamReader -> BufferedReader, FileReader.
    // Writer -> OutputStreamWriter -> FileWriter.

    public static void main(String[] args) throws IOException {
        // A file can contain any kind of format like characters, image, mp3 etc.
        // ByteStream : It means writing or reading from a file a byte at a time.
        // FileInputSteam : It is a java class used for reading byte streams from the file, one item at time.
        // FileOutputStream : It is a Java class used for writing byte stream into the file, one item at time.
        // let's do it!
        // In this program we copy content from one file to another file
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("C:\\Users\\golu\\Desktop\\Java Programs\\src\\IO_Streams\\source_file.txt");
            outputStream = new FileOutputStream("C:\\Users\\golu\\Desktop\\Java Programs\\src\\IO_Streams\\dest_file.txt");

            int content;
            while ((content = inputStream.read()) != -1) {
                outputStream.write((byte) content);
            }
            System.out.println("Copying.....");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Done!");
            // you must should close the stream classes
            if (inputStream != null)
                inputStream.close();
            if (outputStream != null)
                outputStream.close();
        }
    }
}

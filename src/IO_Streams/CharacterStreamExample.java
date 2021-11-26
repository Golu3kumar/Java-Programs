package IO_Streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {

    public static void main(String[] args) throws IOException {

        // CharacterStream : It means writing or reading from a file a character at a time.
        // FileReader : It is a java class used for reading character streams from the file, one item at time.
        // FileWriter : It is a Java class used for writing character stream into the file, one item at time.
        // let's do it!
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("C:\\Users\\golu\\Desktop\\Java Programs\\src\\IO_Streams\\source_file.txt");
            writer = new FileWriter("C:\\Users\\golu\\Desktop\\Java Programs\\src\\IO_Streams\\dest_file.txt");

            int content;
            while ((content = reader.read()) != -1) {
                writer.write((char) content);
            }

            System.out.println("Writing done!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Closed!");
            if (reader != null)
                reader.close();
            if (writer != null)
                writer.close();
        }
    }
}

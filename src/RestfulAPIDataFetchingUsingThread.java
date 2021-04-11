import java.io.IOException;
import java.net.*;
import java.util.Scanner;

// we gonna fetch JSON object from RESTFUL API -> https://gofugly.in/api/categories
public class RestfulAPIDataFetchingUsingThread {
    public static void main(String[] args) {
        System.out.println("This is MainThread, we are calling new thread to Fetch data");
        URL url = null;
        try {
            url = new URL("https://gofugly.in/api/categories");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        FetchThread fetchThread = new FetchThread(url);
        fetchThread.start();

    }
}
class FetchThread extends Thread{
    URL url;
    HttpURLConnection conn;

    public FetchThread(URL url) {
        this.url = url;

    }

    @Override
    public void run() {
        try {
            conn = (HttpURLConnection) this.url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int response = conn.getResponseCode();
            if (response != 200){
                throw new RuntimeException("HttpURLConnection:" +response);
            }else {
                StringBuilder inline = new StringBuilder();
                Scanner sc = new Scanner(url.openStream());
                while (sc.hasNext()){
                    inline.append(sc.nextLine());
                }
                System.out.println("Data is fetched : ");
                System.out.println(inline);
                sc.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package data_structure.Queue;


public class QueueDemo {

    private final String[] playList;
    private int front, rear, len;

    QueueDemo() {
        playList = new String[10];
        front = rear = -1;
        len = 0;
    }

    public boolean isEmpty(){
        return front == -1;
    }

    // enqueue
    public void addToPlaylist(String songName) {
        if (rear == playList.length-1) {
            System.out.println("Playlist is full! Need to delete someone");
            return;
        }

        playList[++rear] = songName;
        if (front == -1)
            front++;
        len++;
    }
    // dequeue
    public String removeFromPlaylist(){
        if (isEmpty()){
            System.out.println("Playlist is empty! Need to add someone");
            return "";
        }
        String deletedSong = playList[front++];
        if (rear == 0)
            rear--;

        len--;
        return deletedSong;
    }

    // returning front
    public String getCurrentSong(){
        if (isEmpty()){
            System.out.println("No song is playing now!");
            return "";
        }
        return playList[front];
    }

    // returning length
    public int getNumberOfSongInPlaylist(){
        return len;
    }

    public void showPlaylist(){
        System.out.println("PlayList : ");
        for (int i = front; i <= rear; i++) {
            System.out.println(playList[i]);
        }
    }

    public static void main(String[] args) {

        QueueDemo romantic = new QueueDemo();
        romantic.addToPlaylist("Aaj Bhi");
        romantic.addToPlaylist("Tum hi ho");
        romantic.addToPlaylist("Jaan Nishar");

        romantic.showPlaylist();

        System.out.println(romantic.getCurrentSong());
        System.out.println(romantic.removeFromPlaylist());
        System.out.println(romantic.getNumberOfSongInPlaylist());
        romantic.showPlaylist();
    }
}

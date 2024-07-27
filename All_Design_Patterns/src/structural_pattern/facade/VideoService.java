package facade;

public class VideoService {
    public void loadVideo(String videoId) {
        System.out.println("Loading video with ID: " + videoId);
    }

    public void playVideo() {
        System.out.println("Playing video.");
    }

    public void stopVideo() {
        System.out.println("Stopping video.");
    }

    public void fetchVideoDetails(String videoId) {
        System.out.println("Fetching details for video ID: " + videoId);
    }
}

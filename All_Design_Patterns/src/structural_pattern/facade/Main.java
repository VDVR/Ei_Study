package facade;

public class Main {
    public static void main(String[] args) {
        VideoStreamingFacade videoStreamingFacade = new VideoStreamingFacade();

        // User subscribes to the service
        videoStreamingFacade.subscribeUser();

        // User logs in and watches a video
        videoStreamingFacade.watchVideo("john_doe", "password123", "video123");

        // Fetch video details
        videoStreamingFacade.getVideoDetails("video123");

        // Fetch recommendations
        videoStreamingFacade.getRecommendations();

        // User stops watching
        videoStreamingFacade.stopWatching();

        // User unsubscribes from the service
        videoStreamingFacade.unsubscribeUser();
    }
}

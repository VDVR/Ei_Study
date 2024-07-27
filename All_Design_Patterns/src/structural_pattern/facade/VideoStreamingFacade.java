package facade;

public class VideoStreamingFacade {
    private AccountService accountService;
    private VideoService videoService;
    private RecommendationService recommendationService;

    public VideoStreamingFacade() {
        this.accountService = new AccountService();
        this.videoService = new VideoService();
        this.recommendationService = new RecommendationService();
    }

    public void watchVideo(String username, String password, String videoId) {
        accountService.login(username, password);
        videoService.loadVideo(videoId);
        videoService.playVideo();
        recommendationService.recommend(videoId);
    }

    public void stopWatching() {
        videoService.stopVideo();
        accountService.logout();
    }

    public void subscribeUser() {
        accountService.subscribe();
    }

    public void unsubscribeUser() {
        accountService.unsubscribe();
    }

    public void getVideoDetails(String videoId) {
        videoService.fetchVideoDetails(videoId);
    }

    public void getRecommendations() {
        recommendationService.getRecommendations();
    }
}

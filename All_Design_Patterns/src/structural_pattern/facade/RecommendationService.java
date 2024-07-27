package facade;

public class RecommendationService {
    public void recommend(String videoId) {
        System.out.println("Recommending videos based on video ID: " + videoId);
    }

    public void getRecommendations() {
        System.out.println("Fetching general recommendations.");
    }
}

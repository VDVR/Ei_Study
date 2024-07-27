package factory;

public class CloudServiceFactory {
    public CloudService createService(String provider) {
        switch (provider.toLowerCase()) {
            case "aws":
                return new AWSService();
            case "azure":
                return new AzureService();
            default:
                throw new IllegalArgumentException("Unknown provider: " + provider);
        }
    }
}

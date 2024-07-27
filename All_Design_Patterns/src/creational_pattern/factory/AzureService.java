package factory;

public class AzureService implements CloudService {
    @Override
    public void deploy() {
        System.out.println("Deploying to Azure");
    }
}

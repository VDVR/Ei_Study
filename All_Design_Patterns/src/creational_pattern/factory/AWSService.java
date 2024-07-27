package factory;

public class AWSService implements CloudService {
    @Override
    public void deploy() {
        System.out.println("Deploying to AWS");
    }
}

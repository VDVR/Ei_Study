package factory;

public class FactoryDemo {
    public static void main(String[] args) {
        CloudServiceFactory factory = new CloudServiceFactory();

        CloudService awsService = factory.createService("AWS");
        awsService.deploy();

        CloudService azureService = factory.createService("Azure");
        azureService.deploy();
    }
}

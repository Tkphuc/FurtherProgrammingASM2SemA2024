package users.providers;



public class providerFactory {

    public static Provider createProvider(String providerType){
        if(providerType.equalsIgnoreCase("Insurance Manager"))
            return new InsuranceManager();
        else if(providerType.equalsIgnoreCase("Insurance Surveyor"))
            return new InsuranceSurveyor();
        else
            System.out.println("Wrong input");
        return null;
    }
}

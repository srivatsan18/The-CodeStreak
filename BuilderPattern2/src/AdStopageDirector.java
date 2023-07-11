public class AdStopageDirector {

    public AdStopage constructAdStopage(AdStopageBuilder adStopageBuilder){
        return adStopageBuilder.setProductName("FactChecker")
                .setServiceName("NAWS")
                .setPrice(20000)
                .build();
    }
}

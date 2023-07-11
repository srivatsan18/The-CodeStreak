public class main {
    public static void main(String [] args){
        AdStopageBuilder adStopageBuilder = new AdStopageBuilderImpl();
        AdStopageDirector adStopageDirector = new AdStopageDirector();

        AdStopage adStopage = adStopageDirector.constructAdStopage(adStopageBuilder);
        System.out.println(adStopage.price + adStopage.productName + adStopage.serviceName);
    }

}

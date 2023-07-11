public class AdStopageBuilderImpl implements  AdStopageBuilder{

    private  AdStopage adStopage;

    public AdStopageBuilderImpl(){
        adStopage = new AdStopage();
    }

    @Override
    public AdStopageBuilder setPrice(long price){
        adStopage.setPrice(price);
        return this;
    }

    @Override
    public AdStopageBuilder setServiceName(String serviceName){
        adStopage.setServiceName(serviceName);
        return this;
    }

    @Override
    public  AdStopageBuilder setProductName(String productName){
        adStopage.setProductName(productName);
        return this;
    }

    public  AdStopage build(){
        return adStopage;
    }
}

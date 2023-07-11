public interface AdStopageBuilder {

    AdStopageBuilder setServiceName( String serviceName);
    AdStopageBuilder setPrice(long price);
    AdStopageBuilder setProductName(String productName);
    AdStopage build();
}

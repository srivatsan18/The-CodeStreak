public class StandardRocketBuilder implements  RocketBuilder{

    private String rocketName;
    private String engineName;
    private int year;

    @Override
    public RocketBuilder setEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    @Override
    public RocketBuilder setRocketName(String rocketName) {
        this.rocketName = rocketName;
        return this;
    }

    @Override
    public RocketBuilder setYear(int year){
        this.year = year;
        return this;
    }
    public Rocket build(){
        return new Rocket(rocketName,engineName,year);
    }
}

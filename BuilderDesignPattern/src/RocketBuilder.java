//Builder
public interface RocketBuilder {

    RocketBuilder setRocketName(String rocketName);
    RocketBuilder setEngineName(String engineName);
    RocketBuilder setYear(int year);
    Rocket build();
}

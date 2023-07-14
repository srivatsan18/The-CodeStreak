public class main {
    public static void main(String [] args){
        RocketBuilder rocket = new StandardRocketBuilder();
        RocketDirector rocketDirector = new RocketDirector();

        Rocket standardRocket = rocketDirector.constructRocket(rocket);
        System.out.println(standardRocket.rocketName + " : Rocket name " + standardRocket.engineName + ": Engine Name");
    }
}

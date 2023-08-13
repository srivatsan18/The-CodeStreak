public class main {

    public static void main(String []args){
        LogHandler applicationLog = new ApplicationLogHandler();
        LogHandler eventLog = new EventLogHandler();
        LogHandler errorLog = new ErrorLogHandler();

        applicationLog.setNextHandler(eventLog);
        eventLog.setNextHandler(errorLog);

        applicationLog.handleRequest(LogLeveller.APPLICATION);
        applicationLog.handleRequest(LogLeveller.ERROR);
        applicationLog.handleRequest(LogLeveller.EVENT);
    }
}

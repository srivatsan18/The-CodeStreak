public class ApplicationLogHandler implements  LogHandler{
    private LogHandler nextHandler ;

    @Override
    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(LogLeveller level) {
        if(level == LogLeveller.APPLICATION){
            System.out.println("This is an application log");
        }
        else if(nextHandler!= null){
            nextHandler.handleRequest(level);
        }
    }
}

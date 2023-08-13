public class EventLogHandler implements  LogHandler{
    private LogHandler nextHandler ;

    @Override
    public void handleRequest(LogLeveller level) {
        if(level == LogLeveller.EVENT){
            System.out.println("This is an Event Handler");
        }
        else if(nextHandler!= null){
            nextHandler.handleRequest(level);
        }
    }

    @Override
    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

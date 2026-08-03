package creational_dp_practice.singleton_dp.logger_system;

public class Logger {
    private static Logger loggerInstance;   // must be static, cause used inside static method getInstance() 
    private int logCount; 

    private Logger() {
        logCount = 0; 
    } 

    public static Logger getInstance() {
        if (loggerInstance == null) {
            loggerInstance = new Logger(); 
        } 

        return loggerInstance; 
    } 

    public int getLogCount() {
        return logCount; 
    } 

    public void log(String message) {
        logCount += 1; 
        System.out.println("[log " + logCount + "] : " + message);  // [log n] : message
    }

}

package org.demo;

import java.util.Objects;

public abstract class LogProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    private LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int level , String msg){
        if(Objects.nonNull(nextLogProcessor)){
            nextLogProcessor.log(level, msg);
        }
    }

}

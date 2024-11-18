package org.demo;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int level, String msg){
        if(level == DEBUG){
            System.out.println("DEBUG" + msg);
        }
        else{
            super.log(level, msg);
        }
    }

}

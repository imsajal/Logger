package org.demo;

public class InfoLogProcessor extends LogProcessor{


    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int level, String msg){
        if(level == INFO){
            System.out.println("INFO" + msg);
        }
        else{
            super.log(level, msg);
        }
    }
}

package com.meituan.gof;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Logger {
    private LogWriter logWriter;
    private Class<?> clazz;

    public Logger(Class<?> clazz) {
        this.clazz = clazz;
    }

    public void info(String msg) {
        logWriter.info(msg);
    }

}

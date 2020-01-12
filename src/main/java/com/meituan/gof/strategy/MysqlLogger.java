package com.meituan.gof.strategy;

import com.meituan.gof.LogWriter;

public class MysqlLogger implements LogWriter {
    @Override
    public void info(String msg) {
        // get mysql connector
        // insert
        // close db connect
    }
}

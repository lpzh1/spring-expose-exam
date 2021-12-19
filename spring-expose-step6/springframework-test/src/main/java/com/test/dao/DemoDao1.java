package com.test.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DemoDao1 {
    //Log log = LogFactory.getLog(DemoDao1.class);
    //TODO 如何得到一个没有名字的 Log 对象
    Log log = LogFactory.getLog("");
    DemoDao1() {
        if (log.isTraceEnabled()){
        }
            log.trace("DemoDao1 trace");
        if (log.isDebugEnabled()){
            log.debug("DemoDao1 debug");
        }
    }
}

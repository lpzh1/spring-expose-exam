package com.test.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class DemoService1 {
    Log log = LogFactory.getLog(DemoService1.class);

    //LogFactory.get
    DemoService1() {
        System.out.println(log.getClass().getName());
        if (log.isTraceEnabled()) {
            log.trace(" trace");
        }
        if (log.isDebugEnabled()) {
            log.debug(" debug");
        }
        if (log.isInfoEnabled()) {
            log.info(" info");
        }
        if (log.isWarnEnabled()) {
            log.warn(" warn");
        }

    }

    public void fun1() {

        System.out.println("com.test.service.DemoService1.fun1");
    }
}

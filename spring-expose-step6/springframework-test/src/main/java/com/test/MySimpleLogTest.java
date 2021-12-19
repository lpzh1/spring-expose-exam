package com.test;

import com.test.service.DemoService1;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MySimpleLogTest {
   static Log log = LogFactory.getLog(MySimpleLogTest.class);
    public static void main(String[] args) {

        log.trace("trace");
        log.debug("debug");

        log.info("info");
        log.warn("warn");
        log.error("error");
        log.fatal("fatal");
    }

}

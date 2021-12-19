package com.test.log;

import com.test.log.service.CommonsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyCommonLogTest {
    static Log log = LogFactory.getLog(MyCommonLogTest.class);
    public static void main(String[] args) {
        CommonsService commonsService = new CommonsService();
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
        log.fatal("fatal");

    }
}

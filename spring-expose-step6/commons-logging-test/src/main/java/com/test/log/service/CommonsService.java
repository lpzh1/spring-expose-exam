package com.test.log.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsService {
    static Log log = LogFactory.getLog(CommonsService.class);
    public CommonsService() {
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
        log.fatal("fatal");

    }
}

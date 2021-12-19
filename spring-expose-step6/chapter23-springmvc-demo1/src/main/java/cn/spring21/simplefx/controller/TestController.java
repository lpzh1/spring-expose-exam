package cn.spring21.simplefx.controller;


import cn.spring21.simplefx.servlet.DelegatingDemoServletProxy;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Soundbank;

public class TestController implements Controller {
    Log log = LogFactory.getLog(TestController.class);
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ModelAndView mv = new ModelAndView("test");

        // spring容器是有哪个类加载器加载的？是Tomcat的类加载器吗？
        // todo 如何得到springmvc的容器（子容器）？
        WebApplicationContext context = RequestContextUtils.getWebApplicationContext(request);
        System.out.println(context.getClass().getClassLoader());

        log.info("test controller !");

        //request.getSession().getServletContext();
        log.info("子容器:"+context.hashCode());
        log.info("父容器:"+context.getParent().hashCode());

        return mv;
    }


}

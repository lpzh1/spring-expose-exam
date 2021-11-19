package cn.spring21.simplefx.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Soundbank;

public class TestController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ModelAndView mv = new ModelAndView("test");

        // spring容器是有哪个类加载器加载的？是Tomcat的类加载器吗？
        // todo 如何得到springmvc的容器（子容器）？
        //ApplicationContext app = (ApplicationContext) request.getAttribute(XmlWebApplicationContext.);
        //System.out.println(app.getClass().getClassLoader());
        WebApplicationContext context = RequestContextUtils.getWebApplicationContext(request);
        System.out.println(context.getClass().getClassLoader());
        //request.


        System.out.println("test controller !");
        return mv;
    }


}

package cn.spring21.simplefx.servlet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

// 将请求委托给spring容器中的 DemoServletProxy Bean
public class DelegatingDemoServletProxy extends HttpServlet {
    Log log = LogFactory.getLog(DelegatingDemoServletProxy.class);
    String targetBeanName;
    WebApplicationContext wac;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object demoServletProxy = wac.getBean(this.targetBeanName);
        if (!(demoServletProxy instanceof Servlet)){
            throw new TypeMatchException("代理目标类需要实现javax.servlet.Servlet接口!");
        }
        log.info("父容器: " + wac.hashCode());
        ((Servlet)demoServletProxy).service(req,resp);

    }

    @Override
    public void init() throws ServletException {
        log.info("cn.spring21.simplefx.servlet.DelegatingDemoServletProxy initialized ......\n\r"+this.hashCode()+"\n\r");
        this.targetBeanName = getServletName();
        this.wac = WebApplicationContextUtils.getWebApplicationContext(getServletContext());

    }



}

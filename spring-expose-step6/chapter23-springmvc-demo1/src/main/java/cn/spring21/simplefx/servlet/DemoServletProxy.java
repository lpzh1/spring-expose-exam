package cn.spring21.simplefx.servlet;

import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@Component("demoServletProxy")
public class DemoServletProxy extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("DemoServletProxy#service: "+this.hashCode());
        resp.getOutputStream().print("<h1>DemoServletProxy#service</h1>");
        // 注意: 父类不支持 POST请求
        // HTTP Status 405 - HTTP method GET is not supported by this URL
        // super.service(req, resp);
    }

    @Override
    public void init() throws ServletException {
        System.out.println("DemoServletProxy#init: "+this.hashCode());
        super.init();
    }
}

package cn.spring21.simplefx.controller;


//import org.springframework.stereotype.Controller;

import cn.spring21.simplefx.domain.TTMRate;
import cn.spring21.simplefx.service.ITTMRateService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.util.List;

// 最简单的Controller试下方式！

public class TTMRateListController extends AbstractController {
    private ITTMRateService ttmRateService;
    private String viewName;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest
                                                         request, HttpServletResponse response) throws Exception {
        List<TTMRate> ttmRateList = getTtmRateService().getTTMRatesToday();
        ModelAndView mav = new ModelAndView(getViewName());
        mav.addObject("ttmRates", ttmRateList);
        return mav;
    }

    public ITTMRateService getTtmRateService() {
        return ttmRateService;
    }

    public void setTtmRateService(ITTMRateService ttmRateService) {
        this.ttmRateService = ttmRateService;
    }

    public String getViewName() {
        return viewName;
    }


    public void setViewName(String viewName) {
        this.viewName = viewName;
    }
}

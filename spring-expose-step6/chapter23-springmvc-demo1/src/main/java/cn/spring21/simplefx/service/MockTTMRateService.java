package cn.spring21.simplefx.service;

import cn.spring21.simplefx.domain.TTMRate;
import cn.spring21.simplefx.domain.TradeDate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MockTTMRateService implements ITTMRateService{
    public List<TTMRate> getTTMRatesToday()
    {
        TradeDate tradeDate20080302 = TradeDate.valueOf("20080302");
        TTMRate USD_JPY = new TTMRate(tradeDate20080302,"USD/JPY",
        new BigDecimal("121.53"));
        TTMRate EUR_USD = new TTMRate(tradeDate20080302,"EUR/USD",
        new BigDecimal("1.8950"));
        List<TTMRate> rateList = new ArrayList<TTMRate>();
        rateList.add(USD_JPY);
        rateList.add(EUR_USD);
        return rateList;
    }
}

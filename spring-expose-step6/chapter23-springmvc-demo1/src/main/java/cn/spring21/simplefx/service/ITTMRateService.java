package cn.spring21.simplefx.service;

import cn.spring21.simplefx.domain.TTMRate;

import java.util.List;

public interface ITTMRateService {
    List<TTMRate> getTTMRatesToday();
}

package com.wanshuiyu.service;

import com.wanshuiyu.model.Poker;

import java.util.Map;

/**
 * Created by Administrator on 2017/10/22.
 * 规则
 */
public class RuleService {

    //水鱼
    public boolean king(Map<Integer,Poker> pokers){
        if(pokers.get(1).getPoint() == pokers.get(2).getPoint() ||
                 pokers.get(3).getPoint() == pokers.get(4).getPoint()){
            return true;
        }
        if(pokers.get(1).getPoint() == pokers.get(2).getPoint() &&
                pokers.get(3).getPoint() == pokers.get(4).getPoint() &&
                pokers.get(2).getPoint() == pokers.get(3).getPoint()){
            return true;
        }
        return false;
    }

    //保牌
    public boolean protect(Map<Integer,Poker> pokers){
        if(pokers.get(1).getPoint() == pokers.get(2).getPoint() &&
                pokers.get(3).getPoint() != pokers.get(4).getPoint()){
            return true;
        }
        return false;
    }
}

package com.wanshuiyu.service;

import com.wanshuiyu.model.Poker;

import java.util.Map;

/**
 * Created by Junhe on 2017/10/23.
 * 规则
 */
public class RuleService {

    public boolean pk(Map<Integer,Poker> banker, Map<Integer,Poker>  player){
       if(DistinguishService.king(banker)) {//水鱼
           if(DistinguishService.zero(player)){//闲家麻麻
               return false;
           }
           return true;
       }
       if(DistinguishService.protect(banker)){//保牌
           if(DistinguishService.protect(player)){//闲家保牌
               if(false){ //同等级PK

               }
               return true;
           }
           if(DistinguishService.dot(player)){//闲家点数 闲家麻麻
               return  true;
           }
       }
        return false;
    }

}

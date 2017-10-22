package com.wanshuiyu.service;
import java.util.Random;

/**
 * Created by Administrator on 2017/7/31.
 * 随机数
 */
public  class MachineService {


   public static  Integer numbers(){
       int max=52;
       int min=1;
       Random random = new  Random();
       return random.nextInt(max)%(max-min+1) + min;
   }

   //返回0 或者 1
   public static int number(){

       return Math.random()>0.5?1:0;
   }
}

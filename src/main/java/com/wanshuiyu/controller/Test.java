package com.wanshuiyu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/11/5.
 */
@Controller
public class Test {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/index")
    public void test() throws Exception {
        stringRedisTemplate.opsForValue().set("aaa", "111");
       // Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
    }

//
//    public void testObj() throws Exception {
//        User user=new User("aa@126.com", "aa", "aa123456", "aa","123");
//        ValueOperations<String, User> operations=redisTemplate.opsForValue();
//        operations.set("com.neox", user);
//        operations.set("com.neo.f", user,1,TimeUnit.SECONDS);
//        Thread.sleep(1000);
//        //redisTemplate.delete("com.neo.f");
//        boolean exists=redisTemplate.hasKey("com.neo.f");
//        if(exists){
//            System.out.println("exists is true");
//        }else{
//            System.out.println("exists is false");
//        }
//        // Assert.assertEquals("aa", operations.get("com.neo.f").getUserName());
//    }
}

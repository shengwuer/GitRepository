package com.lypowernode;

import com.lypowernode.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest09 {
    @Test
    public void test(){

        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        BuyGoodsService service = (BuyGoodsService) ac.getBean("buyGoodsService");
        // 动态代理名称 : com.sun.proxy.$Proxy16
        System.out.println("动态代理名称 : "+service.getClass().getName());
        service.buy(1002,10);

    }
}

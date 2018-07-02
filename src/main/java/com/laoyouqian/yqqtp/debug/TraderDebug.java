package com.laoyouqian.yqqtp.debug;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * 类说明: 交易者测试
 * </pre>
 * @author Chadwick
 * @mail hch_work@163.com
 * @version 
 * 创建时间：2016年4月9日 下午1:41:52
 */
public class TraderDebug {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"trader-consumer.xml"});
        context.start();
        System.out.println(context.getBean("coreTest"));
        System.out.println(context.getBean("nioTest"));
        Test t = (Test) context.getBean("coreTest");
        System.out.println(t.ShowMe());
	}

}

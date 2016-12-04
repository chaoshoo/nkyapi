package com.net.nky.spring;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.net.nky.service.impl.PushMessageThread;

/**
 *  SpringContainers will be allBeanAre all initialized after the completion of re processing.
 * @author Ken
 * @version 2016year4month6day
 */
public class ExecutePostProcessor implements ApplicationListener<ContextRefreshedEvent> {

	Logger LOG = LoggerFactory.getLogger(getClass());

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (event.getApplicationContext().getParent() == null) {
			//执行线程，检查配置，推送消息
			ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
			service.scheduleAtFixedRate(new PushMessageThread(), 0, 30, TimeUnit.SECONDS);
		}

	}

}
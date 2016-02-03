package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.model.OnlyKey;
import com.service.OnlyKeyServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:configs/spring.xml"})
public class ServiceTest {

	private OnlyKeyServiceI onlyKeyService;

	/**
	 * @return the onlyKeyService
	 */
	public OnlyKeyServiceI getOnlyKeyService() {
		return onlyKeyService;
	}

	/**
	 * @param onlyKeyService the onlyKeyService to set
	 */
	@Autowired
	public void setOnlyKeyService(OnlyKeyServiceI onlyKeyService) {
		this.onlyKeyService = onlyKeyService;
	}

	@Test
	public void test1() {
		OnlyKey onlyKey = onlyKeyService.getOnlyKeyByID(1);
		System.out.println(onlyKey);
	}
}

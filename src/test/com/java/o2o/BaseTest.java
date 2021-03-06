package com.java.o2o;

import org.junit.runner.RunWith;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置 springIOC
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置在哪里
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {

}

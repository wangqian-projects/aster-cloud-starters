package com.baidu.fsg.uid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置
 *
 * @author 王骞
 * @date 2021-01-31
 */
@MapperScan("com.baidu.fsg.uid.worker.dao.*")
@ComponentScan("com.baidu.fsg.uid.impl")
@Configuration
@ConditionalOnWebApplication
public class UidGeneratorAutoConfiguration {


}

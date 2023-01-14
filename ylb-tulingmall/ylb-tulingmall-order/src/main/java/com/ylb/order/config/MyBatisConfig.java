package com.ylb.order.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Configuration
@MapperScan("com.ylb.order.mapper")   // 扫描Mapper接口，整合MyBatis
public class MyBatisConfig {

}

package com.zk.datasource;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.cn.base.mapper.mysql") // 指定mapper接口所在包
public class MysqlMybatisConfig {

	@Autowired
	@Qualifier("mysqlds")
	private DataSource mysqlds;

	@Bean
	public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(mysqlds);
		return sessionFactory.getObject();
	}
}

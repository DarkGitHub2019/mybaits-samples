package com.lyle.samples.mybaits.samples.config;


import org.apache.ibatis.session.SqlSessionFactory;
;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MybatisConfig extends MybatisBaseConfig {

    private final String[] ALI_PAKAGES = {"com.lyle.samples.mybaits.samples.entity"};

    @Bean(name = "lyleSqlSessionFactory")
    public SqlSessionFactory getSqlSessionFactory(DataSource dataSource) throws Exception {
        return super.getSqlSessionFactory(dataSource, ALI_PAKAGES);
    }
}
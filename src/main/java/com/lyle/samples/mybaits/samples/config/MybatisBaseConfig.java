package com.lyle.samples.mybaits.samples.config;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;

import javax.sql.DataSource;

public class MybatisBaseConfig {
    public SqlSessionFactory getSqlSessionFactory(DataSource dataSource, String [] aliasPackages) throws Exception {

        final SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage(String.join(",", aliasPackages));

        SqlSessionFactory factory = sqlSessionFactoryBean.getObject();

        Configuration configuration = factory.getConfiguration();

        configuration.setMapUnderscoreToCamelCase(true);
        return factory;
    }
}

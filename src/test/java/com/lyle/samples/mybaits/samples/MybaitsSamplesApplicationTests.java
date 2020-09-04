package com.lyle.samples.mybaits.samples;


import com.lyle.samples.mybaits.samples.entity.EmplyeeEntity;
import com.lyle.samples.mybaits.samples.mapper.EmplyeeMapper;
import com.lyle.samples.mybaits.samples.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

@SpringBootTest
class MybaitsSamplesApplicationTests {

    @Resource
    UserMapper userMapper;

    @Resource(name = "lyleSqlSessionFactory")
    SqlSessionFactory sqlSessionFactory;

    @Test
    void testConn() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.selectOneById(2L);
        sqlSession.close();
    }

    @Test
    void testXmlConn() throws IOException {
        String source = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(source);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = factory.openSession();
        EmplyeeMapper emplyeeMapper = sqlSession.getMapper(EmplyeeMapper.class);
        EmplyeeEntity emplyeeEntity = emplyeeMapper.selectOne(1300997153142591489L);
        System.out.println(emplyeeEntity);

    }
}

package demo.test.application.impl;

import demo.test.application.TestApplication;
import demo.test.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2018/3/30.
 */
@Service
public class TestApplicationImpl implements TestApplication {
    @Autowired
    private TestMapper testMapper;

//    @Resource
//    @Override
//    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
//        super.setSqlSessionFactory(sqlSessionFactory);
//    }

    @Override
    public List<Map<String, Object>> test() {
        return testMapper.testQuery();
    }
}

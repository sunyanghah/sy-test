package demo.test.web;

import demo.test.application.TestApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2018/3/26.
 * @author dell
 */
@RestController
@Slf4j
public class TestController {

    @Autowired
    private TestApplication testApplication;

    @RequestMapping(value = "/sy/test",method = RequestMethod.GET)
    public String test() throws Exception{
        List<Map<String,Object>> list = testApplication.test();
        String rt = "";
        for (Map<String,Object> map : list){
            rt += map.get("name")+",";
        }
        log.info("========================================={}",rt);
        return rt;
    }
}

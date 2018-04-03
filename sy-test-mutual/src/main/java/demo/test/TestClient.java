package demo.test;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Named;

/**
 * Created by dell on 2018/3/31.
 * @author dell
 */
@FeignClient(name = "sy-test-server",fallback = TestClientFallback.class)
public interface TestClient {

    /**
     * test
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/sy/test",method = RequestMethod.GET)
    String test() throws Exception;
}

package demo.test;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


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
    OutAddUserDto test() throws Exception;

    /**
     * test
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/sy/test2",method = RequestMethod.POST)
    OutAddUserDto test2() throws Exception;
}

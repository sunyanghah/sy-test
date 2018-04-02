package demo.test;

import javax.inject.Named;

/**
 * Created by dell on 2018/3/31.
 * @author dell
 */
@Named
public class TestClientFallback implements TestClient {

    @Override
    public String test() throws Exception {
        return null;
    }
}

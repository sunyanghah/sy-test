package demo.test;

import javax.inject.Named;

/**
 * Created by dell on 2018/3/31.
 * @author dell
 */
@Named
public class TestClientFallback implements TestClient {


    @Override
    public OutAddUserDto test() throws Exception {
        return null;
    }

    @Override
    public OutAddUserDto test2() throws Exception {
        return null;
    }
}

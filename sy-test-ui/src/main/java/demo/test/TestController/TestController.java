package demo.test.TestController;


import demo.test.InAddUserDto;
import demo.test.OutAddUserDto;
import demo.test.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * Created by dell on 2018/3/31.
 */
@Controller
public class TestController {

    @Autowired
    private TestClient testClient;

    @RequestMapping(value = {"/","/index"},method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("test","testValue");
        return "index";
    }

    @RequestMapping(value = "/test/addUser",method = RequestMethod.POST)
    @ResponseBody
    public OutAddUserDto addUser(@RequestBody InAddUserDto inAddUserDto) throws Exception{
        OutAddUserDto outAddUserDto;
//        System.out.println("---------------"+inAddUserDto.getUserName()+"---------------"+inAddUserDto.getPassWord());
       if ("1".equals(inAddUserDto.getUserName())){
           outAddUserDto = testClient.test();
       }else {
           outAddUserDto = testClient.test2();
       }
        outAddUserDto.setResult(outAddUserDto.getResult());
        return outAddUserDto;
    }

}

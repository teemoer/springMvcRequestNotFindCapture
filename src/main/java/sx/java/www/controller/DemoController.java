package sx.java.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sx.java.www.mvc.dto.ErrorResult;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/index")
    public String index(){
        return "/index";
    }

    @RequestMapping("/notFound")
    @ResponseBody
    public ErrorResult notFind(
          @RequestParam(required = false) String path,
          @RequestParam(required = false) String method
    ){

        return new ErrorResult(1,path,method,"接口不存在");
    }
}

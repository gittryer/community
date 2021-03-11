package life.dream.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author gityee
 */
@Controller
public class IndexController
{
    @GetMapping("/")
    public String index()
    {
        //对应模板中的hello.html
        return "index";
    }
}

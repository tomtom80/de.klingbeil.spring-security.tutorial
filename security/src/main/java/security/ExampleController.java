package security;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController {

  @RequestMapping("/secured")
  @ResponseBody
  public String securedContent() {
    return "whooow secured content!!";
  }

  @RequestMapping("/")
  @ResponseBody
  public String index() {
    return "it works!";
  }
}
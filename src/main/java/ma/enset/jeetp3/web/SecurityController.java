package ma.enset.jeetp3.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@AllArgsConstructor
@Controller
public class SecurityController {

    @GetMapping("/NotAuthorized")
    public String notAuthorize() {
        return "NotAuthorized";
    }

    @GetMapping("/login")
    public String login() {
        return "Login";
    }
}

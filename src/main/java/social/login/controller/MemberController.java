package social.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
    //회원가입 페이지
    @GetMapping("/member/save")
    public String saveForm(){
        return "save";
    }
}

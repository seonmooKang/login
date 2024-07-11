package social.login.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import social.login.dto.MemberDTO;
import social.login.service.MemberService;

@Controller
@RequiredArgsConstructor
public class MemberController {
    //생성자 주입
    private final MemberService memberService;

    //회원가입 페이지
    @GetMapping("/member/join")
    public String saveForm(){return "save";}

    @PostMapping("/member/join")
    public String save(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("MemberController.save");
        System.out.println("MemberDTO = " + memberDTO);
        memberService.save(memberDTO);
        return "index";
    }
}

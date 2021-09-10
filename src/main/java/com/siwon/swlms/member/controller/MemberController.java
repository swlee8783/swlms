package com.siwon.swlms.member.controller;

import com.siwon.swlms.member.entity.Member;
import com.siwon.swlms.member.model.MemberInput;
import com.siwon.swlms.member.repository.MemberRepository;
import com.siwon.swlms.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@Controller
public class MemberController {

    private final MemberService memberService;

    @GetMapping(value = "/member/register")
    public String register() {
        return "member/register";
    }

    // request  WEB->SERVER
    // response SERVER->WEB
    @PostMapping(value = "/member/register")
    public String registerSubmit(Model model,
                                 HttpServletRequest request,
                                 MemberInput parameter) {

        boolean result = memberService.register(parameter);
        model.addAttribute("result", result);

        return "member/register_complete";
    }
}

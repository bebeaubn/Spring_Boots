package org.koreait.restcontrollers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.koreait.entities.Member;
import org.koreait.repositories.MemberRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class ApiMemberController {

    private final MemberRepository repository;

    @GetMapping("{/userId}")
    public Member info(@PathVariable String userId){
        Member member = repository.findByUserId(userId);

        return member;

    }
    @GetMapping("/list")
    public List<Member> list(){
        List<Member> members = (List<Member>)repository.findAll();


        return members;
    }

    @GetMapping("/hello")
    public String hello(){
        return "안녕하세요";

    }
    @GetMapping("/test")
    public void test(){
        log.info("테스트...");

    }

    public void login(RequestLogin form) {
        log.info(form.toString());

    }
}


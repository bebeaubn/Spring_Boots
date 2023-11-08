package org.koreait.restcontrollers;

import lombok.RequiredArgsConstructor;
import org.koreait.entities.Member;
import org.koreait.repositories.MemberRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

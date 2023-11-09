package org.koreait.restcontrollers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.koreait.entities.Member;
import org.koreait.repositories.MemberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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


    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid RequestLogin form, Errors errors) {    //json형식으로 반환한다고 알려주기 검증실패하면 error에 담아서 보여주기

        if(errors.hasErrors()){
            String message = errors.getAllErrors().stream()
                    .map(o -> o.getDefaultMessage())
                    .collect(Collectors.joining(","));   //현재 발생한 모든 에러가 담겨져 있다

            throw new RuntimeException(message);

        }

        log.info(form.toString());

        /*
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("TestHeader","Test")
                .build();     //출력데이터가 없을때 빌드로 끝내면된다.


         */

        return ResponseEntity.ok().build();   //출력 데이터가 없을때 빌드로 끝내면 된다.
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> errorHandler(Exception e){

     ResponseEntity<String> response = ResponseEntity
             .badRequest()
             .body(e.getMessage());

     return response;

    }
}


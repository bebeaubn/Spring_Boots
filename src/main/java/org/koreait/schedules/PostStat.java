package org.koreait.schedules;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;


@Slf4j    //log.info  log.error  log.warn  lombok으로 연동 시킨것  다른거 사용해도 가능
@Service
public class PostStat {

    //@Scheduled(cron="0 0 0 1 * * *")   //새벽 1시
    //@Scheduled(cron = "*/5 * * * * *")   //5초마다

    //@Scheduled(fixedDelay = 5, timeUnit = TimeUnit.SECONDS)  //5초 고정간격으로 실행
    //@Scheduled(initialDelay = 5, timeUnit = TimeUnit.SECONDS)  // 작업 시작전 5초 대기
    public void process(){

        log.info("게시글 통계 작업 수행....");

        // System.out.println("게시글 통계 수행..."); log로 만들기 전에 예시

        // 쿼리 만들고 DB에 만들어서 넣으면 된다,,,,
    }
}

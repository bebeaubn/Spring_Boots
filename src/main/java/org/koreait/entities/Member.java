package org.koreait.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data @Builder
@AllArgsConstructor @NoArgsConstructor
public class Member {
    @Id
    private Long userNo;
    private String userId;

    @JsonIgnore   //안보이게 하고 싶은 부분을 출력 배재시키는것
    private String userPw;
    private String userNm;
    private String email;
    private String mobile;

    @JsonFormat(pattern = "yyyy.MM.dd HH:mm")

    private LocalDateTime regDt;
    private LocalDateTime modDt;
}

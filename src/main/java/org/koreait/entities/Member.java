package org.koreait.entities;

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
    private String userPw;
    private String userNm;
    private String email;
    private String mobile;
    private LocalDateTime regDt;
    private LocalDateTime modDt;
}

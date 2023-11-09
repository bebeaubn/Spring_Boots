package org.koreait.restcontrollers;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RequestLogin {
    @NotBlank
    private String userId;

    @NotBlank
    private String userPw;

}

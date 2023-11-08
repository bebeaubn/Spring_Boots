package org.koreait.restcontrollers;

import lombok.Data;

@Data
public class RequestLogin {
    private String userId;
    private String userPw;

}

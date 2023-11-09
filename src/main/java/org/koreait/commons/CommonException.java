package org.koreait.commons;

import org.springframework.http.HttpStatus;

public class CommonException extends RuntimeException{

    private HttpStatus status;

    public CommonException(String message){
        super(message);

        status = HttpStatus.INTERNAL_SERVER_ERROR; // 500으로 고정

    }

    public CommonException(String message, HttpStatus status){
        super(message);
        this.status=status;
    }

    public HttpStatus getStatus(){
        return status;
    }
}

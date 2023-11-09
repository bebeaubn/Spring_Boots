package org.koreait.commons;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class JSONData<T> {

    private HttpStatus status = HttpStatus.OK;   //고정 많이 나오는 응답 코드는 반복없이 쓰기 위해
    private boolean success = true;              //고정 많이 나오는 상태 코드는 반복없이 쓰기 위해

    @NonNull
    private T data;
    private String message;

}

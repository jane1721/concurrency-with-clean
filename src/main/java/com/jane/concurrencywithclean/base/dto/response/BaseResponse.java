package com.jane.concurrencywithclean.base.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jane.concurrencywithclean.base.dto.BaseErrorCode;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponse {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime timestamp = LocalDateTime.now();
    private String message = BaseErrorCode.SUCCESS.getMessage(); // 예외 메세지
    private String status = BaseErrorCode.SUCCESS.getHttpStatus().toString(); // HTTP 상태 코드
}

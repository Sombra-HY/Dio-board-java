package com.lsn.board.exception.base;

import com.lsn.board.exception.model.ErrorCode;
import lombok.Getter;
import org.springframework.http.HttpStatus;

// business exception should be inherited by the class

@Getter
public class BusinessException extends RuntimeException {
    private final ErrorCode code;
    private final HttpStatus status;

    public BusinessException(String message, ErrorCode code, HttpStatus status) {
        super(message);
        this.code = code; // error code
        this.status = status; //definir code http
    }
}

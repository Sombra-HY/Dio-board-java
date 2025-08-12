package com.lsn.board.exception.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class ErrorResponse {
    private LocalDateTime timestamp;
    private int status;
    private String error;
    private ErrorCode code;
    private String message;
    private String path;
    private List<ValidationError> fieldErrors;

    public ErrorResponse(int status, String error, ErrorCode code, String message, String path) {
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.error = error;
        this.code = code;
        this.message = message;
        this.path = path;
    }

}

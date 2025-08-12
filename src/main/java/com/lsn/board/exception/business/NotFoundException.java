package com.lsn.board.exception.business;


import com.lsn.board.exception.base.BusinessException;
import com.lsn.board.exception.model.ErrorCode;
import org.springframework.http.HttpStatus;

public class NotFoundException extends BusinessException {
    public NotFoundException(String message) {
        super(message, ErrorCode.RESOURCE_NOT_FOUND, HttpStatus.NOT_FOUND);    }

}

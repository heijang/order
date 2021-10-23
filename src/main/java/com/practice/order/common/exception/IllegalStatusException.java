package com.practice.order.common.exception;

import com.practice.order.common.response.ErrorCode;

public class IllegalStatusException extends BaseException {
    public IllegalStatusException() {
        super(ErrorCode.COMMON_ILLEGAL_STATUS);
    }

    public IllegalStatusException(String errorMsg) {
        super(errorMsg, ErrorCode.COMMON_ILLEGAL_STATUS);
    }
}

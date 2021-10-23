package com.practice.order.common.exception;

import com.practice.order.common.response.ErrorCode;

public class EntityNotFoundException extends BaseException {
    public EntityNotFoundException() {
        super(ErrorCode.COMMON_ENTITY_NOT_FOUND);
    }

    public EntityNotFoundException(String errorMsg) {
        super(errorMsg, ErrorCode.COMMON_ENTITY_NOT_FOUND);
    }
}

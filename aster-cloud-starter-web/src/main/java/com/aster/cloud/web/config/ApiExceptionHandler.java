package com.aster.cloud.web.config;

import com.aster.cloud.commons.core.api.ApiException;
import com.aster.cloud.commons.core.api.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * REST API 异常拦截处理器
 *
 * @author 王骞
 * @date 2021-01-30
 */
@Slf4j
@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = ApiException.class)
    public Result<String> handlerException(ApiException e) {
        log.error("ApiException: ");
        return Result.failed(e.getMessage());
    }

}

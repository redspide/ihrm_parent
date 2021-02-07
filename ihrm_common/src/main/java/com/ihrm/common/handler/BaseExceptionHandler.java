package com.ihrm.common.handler;

import com.ihrm.common.entity.Result;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
@ResponseBody
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Result catchException(HttpServletRequest request, HttpServletResponse response ,Exception e){
        if (e.getClass() == CommonException.class) {
            CommonException exception =(CommonException) e;
            Result result = new Result(exception.getResultCode());
            return result;
        }else {
            Result result = new Result();
            result.setCode(Result.ERROR().getCode());
            return result;
        }

    }

}

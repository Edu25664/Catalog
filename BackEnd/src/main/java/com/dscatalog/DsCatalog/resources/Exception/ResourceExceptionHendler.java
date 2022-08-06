package com.dscatalog.DsCatalog.resources.Exception;

import com.dscatalog.DsCatalog.Exception.EntityNotFundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHendler {

    @ExceptionHandler(EntityNotFundException.class)
    public ResponseEntity<StandardErro> entityNotFound(EntityNotFundException e, HttpServletRequest request) {
         StandardErro err = new StandardErro();
         err.setTimestamp(Instant.now());
         err.setStatus(HttpStatus.NOT_FOUND.value());
         err.setError("Resource not found");
         err.setMessage(e.getMessage());
         err.getPath(request.getRequestURI());
         return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }

}

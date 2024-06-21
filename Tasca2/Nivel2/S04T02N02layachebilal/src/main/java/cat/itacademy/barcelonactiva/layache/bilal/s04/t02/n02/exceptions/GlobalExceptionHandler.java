package cat.itacademy.barcelonactiva.layache.bilal.s04.t02.n02.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(FruitNotFoundException.class)
        public ResponseEntity<ErrorMessage> FruitNotFoundException(FruitNotFoundException fr, WebRequest request) {
            ErrorMessage message = new ErrorMessage(
                    HttpStatus.NOT_FOUND.value(),
                    fr.getMessage(),
                    request.getDescription(false));

            return new ResponseEntity<ErrorMessage>(message, HttpStatus.NOT_FOUND);
        }
    }



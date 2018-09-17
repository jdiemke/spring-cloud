package io.github.jdiemke.springcloud;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Name computation failed!")
class ComputationFailedException extends RuntimeException {

}

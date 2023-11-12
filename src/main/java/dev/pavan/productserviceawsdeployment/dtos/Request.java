package dev.pavan.productservice.dtos;

import dev.pavan.productservice.security.JwtObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Request<T> {
    T userPayload;
    JwtObject authPayload;
}

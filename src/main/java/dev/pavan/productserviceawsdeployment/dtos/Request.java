package dev.pavan.productserviceawsdeployment.dtos;

import dev.pavan.productserviceawsdeployment.security.JwtObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Request<T> {
    T userPayload;
    JwtObject authPayload;
}

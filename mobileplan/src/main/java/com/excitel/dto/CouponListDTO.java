package com.excitel.dto;

import com.excitel.model.Coupons;
import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponListDTO {

    private HttpStatus status;
    private List<Coupons> coupons;
}

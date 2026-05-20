package com.srilankagem.gembackend.gem.dto;

import com.srilankagem.gembackend.gem.models.GemOrigin;
import com.srilankagem.gembackend.gem.models.GemTreatment;
import com.srilankagem.gembackend.gem.models.GemType;
import jakarta.validation.constraints.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GemStoneRequest {

    @NotBlank(message = "Gem code is required")
    @Size(min = 3, max = 30, message = "gem code must be beteween 3 to 30 characters")
    private String gemCode;

    @NotNull
    private GemType type; // should put the name of the enum not String or anything.

    @NotBlank(message = "color is required")
    private String color;

    @NotNull
    @DecimalMin(value = "0.01" , message =  "Value must be greater than 0.01")
    private Double caratWeight;

    @NotNull(message = "origin is required")
    private GemOrigin origin;

    @NotNull(message = "gem treatment is required")
    private GemTreatment treatment;

    @NotNull
    @DecimalMin(value = "0.01" , message =  "Value must be greater than 0.01")
    private Double pricePerCarat;

    @NotNull
    @Min(value = 0, message = "Value has to be greater than 0")
    private Integer stockQuantity;

    @NotBlank
    @Size(max = 1000)
    private String description;


    private boolean certified;

}

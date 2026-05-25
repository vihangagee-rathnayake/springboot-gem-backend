package com.srilankagem.gembackend.gem.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class CertificateRequest {

    @NotBlank(message = "Certificate number is required")
    private String certificateNumber;

    @NotNull(message = "Gem Id is required")
    private Long gemId;

    @NotBlank(message = "Issue by is required")
    private String issuedBy;

    @NotNull(message = "Issue Date is required")
    private LocalDate issueDate;

    @NotNull(message = "Expiry Date is required")
    private LocalDate expiryDate;

    private String remarks;
}

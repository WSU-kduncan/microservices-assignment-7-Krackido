package com.wsu.shopflowproservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MechanicDTO {

    private Integer id;

    @NotBlank(message = "First Name must not be null or blank")
    private String firstName;

    @NotBlank(message = "Last Name must not be null or blank")
    private String lastName;

    @NotBlank(message = "Specialization must not be null or blank")
    private String specialization;

}
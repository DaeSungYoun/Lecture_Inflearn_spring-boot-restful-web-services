package com.example.restfulwebservice.domain;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@JsonFilter("UserInfoV2")
public class UserV2 extends User {
    private String grade;
}

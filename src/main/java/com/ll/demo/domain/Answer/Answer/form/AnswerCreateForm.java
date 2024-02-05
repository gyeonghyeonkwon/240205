package com.ll.demo.domain.Answer.Answer.form;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerCreateForm {

    @NotBlank
    private String content;
}

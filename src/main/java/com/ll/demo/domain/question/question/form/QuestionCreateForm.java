package com.ll.demo.domain.question.question.form;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionCreateForm {

    @NotBlank
    private String title;

    @NotBlank
    private String content;
}

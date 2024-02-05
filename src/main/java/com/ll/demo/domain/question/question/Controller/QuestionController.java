package com.ll.demo.domain.question.question.Controller;

import com.ll.demo.domain.question.question.Service.QuestionService;
import com.ll.demo.domain.question.question.form.QuestionCreateForm;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/question")
public class QuestionController {

    private final QuestionService questionService;
    @GetMapping("/write")
    public String showWrite(QuestionCreateForm questionCreateForm) {


        return "domain/question/question/question_form";

    }

    @PostMapping("/write")
    public String questionWrite2(@Valid QuestionCreateForm questionCreateForm ) {

        questionService.createWrite(questionCreateForm.getTitle() , questionCreateForm.getContent());


        return "redirect:/question/list";
    }
}

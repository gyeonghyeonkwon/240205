package com.ll.demo.domain.question.question.Controller;

import com.ll.demo.domain.question.question.Entity.Question;
import com.ll.demo.domain.question.question.Repository.QuestionRepository;
import com.ll.demo.domain.question.question.Service.QuestionService;
import com.ll.demo.domain.question.question.form.QuestionCreateForm;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/question")
public class QuestionController {

    private final QuestionService questionService;
    private final QuestionRepository questionRepository;
    @GetMapping("/write")
    public String showWrite(QuestionCreateForm questionCreateForm , Model model) {

        model.addAttribute("questionCreateForm" , questionCreateForm);
        return "domain/question/question/question_form";

    }

    @PostMapping("/write")
    public String questionWrite2(@Valid QuestionCreateForm questionCreateForm ) {

        questionService.createWrite(questionCreateForm.getTitle() , questionCreateForm.getContent());


        return "redirect:/question/list";
    }

    @GetMapping("/list")
    public String showList(Model model ) {

        List<Question> questions =  questionRepository.findAll();

        model.addAttribute("questions" , questions);

        return "domain/question/question/list";
    }
}

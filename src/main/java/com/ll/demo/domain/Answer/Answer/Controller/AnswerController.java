package com.ll.demo.domain.Answer.Answer.Controller;

import com.ll.demo.domain.Answer.Answer.Service.AnswerService;
import com.ll.demo.domain.Answer.Answer.form.AnswerCreateForm;
import com.ll.demo.domain.question.question.Entity.Question;
import com.ll.demo.domain.question.question.Service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/answer")
public class AnswerController {

    private final QuestionService questionService;
    private final AnswerService answerService ;

    @PostMapping("/create/{id}")
    public String createAnswer(Model model, @PathVariable("id") Long id, AnswerCreateForm answerCreateForm) {
        Question question = this.questionService.getQuestion(id);
        // TODO: 답변을 저장한다.
        answerService.createAnswer(question , answerCreateForm.getContent());
        return String.format("redirect:/question/detail/%s", id);
    }

}

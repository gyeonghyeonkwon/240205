package com.ll.demo.domain.Answer.Answer.Service;

import com.ll.demo.domain.Answer.Answer.Entity.Answer;
import com.ll.demo.domain.Answer.Answer.Repository.AnswerRepository;
import com.ll.demo.domain.question.question.Entity.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnswerService {

    private final AnswerRepository answerRepository;

    public void createAnswer (Question question , String content) {

        Answer answer = Answer.builder()

                .content(content)
                .question(question)
                .build();
        answerRepository.save(answer);
    }
}

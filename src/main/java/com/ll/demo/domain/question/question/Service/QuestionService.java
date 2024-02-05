package com.ll.demo.domain.question.question.Service;

import com.ll.demo.domain.question.question.Entity.Question;
import com.ll.demo.domain.question.question.Repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public void createWrite(String title, String content) {
        Question question = Question.builder()
                .title(title)
                .content(content)
                .build();

        this.questionRepository.save(question);
    }
}

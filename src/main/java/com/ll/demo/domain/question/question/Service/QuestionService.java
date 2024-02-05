package com.ll.demo.domain.question.question.Service;

import com.ll.demo.domain.question.question.Entity.Question;
import com.ll.demo.domain.question.question.Repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Question getQuestion(Long id) {
        Optional<Question> question = this.questionRepository.findById(id);
        if (question.isPresent()) {
            return question.get();
        } else {
            throw new RuntimeException("question not found");
        }
    }
}

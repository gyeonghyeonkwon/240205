package com.ll.demo.domain.Answer.Answer.Repository;

import com.ll.demo.domain.Answer.Answer.Entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer , Long> {
}

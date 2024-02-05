package com.ll.demo.domain.Answer.Answer.Entity;

import com.ll.demo.domain.global.BaseEntity;
import com.ll.demo.domain.question.question.Entity.Question;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Setter
@Getter
@ToString(callSuper = true)
public class Answer extends BaseEntity {

    @Column
    private String content;

    @ManyToOne
    private Question question;
}

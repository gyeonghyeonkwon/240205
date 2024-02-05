package com.ll.demo.domain.question.question.Entity;

import com.ll.demo.domain.global.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@Setter
@Getter
@ToString(callSuper = true)
public class Question extends BaseEntity {

    @Column
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

//    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
//    private List<Answer> answerList;
}

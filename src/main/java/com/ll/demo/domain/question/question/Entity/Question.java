package com.ll.demo.domain.question.question.Entity;

import com.ll.demo.domain.global.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Setter
@Getter
@ToString(callSuper = true)
public class Question extends BaseEntity {

    @Column
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;
}

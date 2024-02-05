package com.ll.demo.domain.Answer.Answer.Entity;

import com.ll.demo.domain.global.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Setter
@Getter
@ToString(callSuper = true)
public class Answer extends BaseEntity {


}

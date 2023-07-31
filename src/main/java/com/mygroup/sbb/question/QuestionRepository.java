package com.mygroup.sbb.question;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject);
    Question findBySubjectAndContent(String subject, String content);
    List<Question> findBySubjectLike(String subject);

}
//JPA레포지토리를 사용해서 엔티티로 레포지토리에 입력 레포지토리가 디비에 저장하는것
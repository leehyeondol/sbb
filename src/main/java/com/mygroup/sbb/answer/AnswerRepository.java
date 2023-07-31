package com.mygroup.sbb.answer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}
//엔티티 -> 데이터 표현, 데이터 저장 등
//레포지토리 ->데이터 저장기능, 조회 등
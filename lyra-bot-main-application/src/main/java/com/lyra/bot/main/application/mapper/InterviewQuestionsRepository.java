package com.lyra.bot.main.application.mapper;

import com.lyra.bot.main.application.entity.InterviewQuestionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewQuestionsRepository extends JpaRepository<InterviewQuestionsEntity, Long> {
    @Query(value = "select count(*) as count from interview_questions", nativeQuery = true)
    Long getInterviewQuestionCount();

    @Query(value = "select * from interview_questions limit #{randomCount}, 1;", nativeQuery = true)
    InterviewQuestionsEntity selectOneInterviewQuestion(Long randomCount);
}

package com.fantasy.fuoj.judge;

import com.fantasy.fuoj.judge.strategy.DefaultJudgeStrategy;
import com.fantasy.fuoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.fantasy.fuoj.judge.strategy.JudgeContext;
import com.fantasy.fuoj.judge.strategy.JudgeStrategy;
import com.fantasy.fuoj.model.dto.questionsubmit.JudgeInfo;
import com.fantasy.fuoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}

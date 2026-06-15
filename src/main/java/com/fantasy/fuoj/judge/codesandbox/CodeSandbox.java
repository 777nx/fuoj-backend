package com.fantasy.fuoj.judge.codesandbox;

import com.fantasy.fuoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.fantasy.fuoj.judge.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param request
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest request);
}

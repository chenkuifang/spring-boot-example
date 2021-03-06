package com.example.controller;

import com.example.task.HelloWorldTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author QuiFar
 * @version V1.0
 **/
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Autowired
    private HelloWorldTask helloWorldTask;

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/ec")
    public void executor() {
        for (int i = 0; i < 20; i++) {
            // 执行任务
            threadPoolTaskExecutor.execute(helloWorldTask);
        }
    }
}

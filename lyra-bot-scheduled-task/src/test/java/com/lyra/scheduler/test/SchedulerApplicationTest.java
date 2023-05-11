package com.lyra.scheduler.test;

import com.lyra.scheduler.job.SignJob;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SchedulerApplicationTest {
    @Autowired
    private SignJob signJob;

    @Test
    public void testJob() {
        signJob.sign();
    }
}

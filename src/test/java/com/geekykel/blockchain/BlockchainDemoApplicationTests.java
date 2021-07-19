package com.geekykel.blockchain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class BlockchainDemoApplicationTests {

    private static final Logger LOG = LoggerFactory.getLogger(BlockchainDemoApplicationTests.class);

    @Test
    void contextLoads() {
    }

    @Test
    void githubAction() {
        LOG.info("Success");
        Assertions.assertEquals(5 + 2, 7);
    }
}

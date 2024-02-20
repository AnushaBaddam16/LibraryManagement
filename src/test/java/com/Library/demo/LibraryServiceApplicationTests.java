package com.Library.demo;

import com.Library.demo.controller.MemberController;
import com.Library.demo.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = { MemberController.class, MemberService.class})
class LibraryServiceApplicationTests {

    @Test
    void contextLoads() {

    }

}

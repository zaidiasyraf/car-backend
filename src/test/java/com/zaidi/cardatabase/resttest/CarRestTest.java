package com.zaidi.cardatabase.resttest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//public class CarRestTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void testAuthentication() throws Exception {
//        // Testing authentication with correct credentials
//        this.mockMvc.perform(MockMvcRequestBuilders.post("/login")
//                .content("{\"username\":\"admin\", \"password\":\"admin\"}"))
//                .andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk());
//
//        // Testing authentication with wrong credentials
//        this.mockMvc.perform(MockMvcRequestBuilders.post("/login")
//                .content("{\"username\":\"admin\", \"password\":\"wrongpwd\"}"))
//                .andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().is4xxClientError());
//    }
//}

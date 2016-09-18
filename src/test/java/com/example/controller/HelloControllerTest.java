package com.example.controller;

import com.example.init.InfrastructureConfig;
import com.example.init.WebAppConfig;
import com.example.init.WebStaticResConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by Developer on 2016/9/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {InfrastructureConfig.class, WebAppConfig.class, WebStaticResConfig.class})
@WebAppConfiguration
public class HelloControllerTest {
    @Autowired
    private WebApplicationContext context;

    private MockMvc mvc;

    @Before
    public void setup() {
        mvc = MockMvcBuilders
                .webAppContextSetup(context)
                .build();
    }

    @Test
    public void goToHelloPage() throws Exception {
        mvc.perform(get("/index")).andExpect(view().name("index"));
    }

}
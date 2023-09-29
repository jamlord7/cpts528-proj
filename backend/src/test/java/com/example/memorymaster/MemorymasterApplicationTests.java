package com.example.memorymaster;

import com.plexpt.chatgpt.ChatGPT;
import com.plexpt.chatgpt.util.Proxys;
import io.github.flashvayne.chatgpt.dto.chat.MultiChatMessage;
import io.github.flashvayne.chatgpt.service.ChatgptService;
import org.json.JSONException;

import org.json.JSONObject;

import java.net.Proxy;
import java.util.Arrays;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.*;
import java.util.Iterator;
import java.util.zip.CRC32;

@SpringBootTest
class MemorymasterApplicationTests {
    @Autowired
    private ChatgptService chatgptService;

    @Test
    void contextLoads() throws SQLException, JSONException {

    }


    @Test
    public void test(){
        //国内需要代理
        Proxy proxy = Proxys.http("127.0.0.1", 33210);
        //socks5 代理
        // Proxy proxy = Proxys.socks5("127.0.0.1", 1080);

        ChatGPT chatGPT = ChatGPT.builder()
                .apiKey("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")
                .proxy(proxy)
                .apiHost("https://api.openai.com/") //反向代理地址
                .build()
                .init();

        String res = chatGPT.chat("写一段七言绝句诗，题目是：火锅！");
        System.out.println(res);
    }
}




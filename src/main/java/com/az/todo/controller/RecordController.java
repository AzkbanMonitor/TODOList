package com.az.todo.controller;

import com.az.todo.vo.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/record")
@Slf4j
public class RecordController {

    @GetMapping("/fuzzyQuery")
    public ResultVo fuzzyQueryRecordList(HttpServletRequest request, @PathParam("pageNum") int pageNum, @PathParam
            ("pageSize") int pageSize, @PathParam("key") String key) {

    }

}

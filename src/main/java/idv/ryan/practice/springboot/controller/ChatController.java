package idv.ryan.practice.springboot.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "api")
public class ChatController {

    @ApiOperation(value = "Chat controller", notes = "Chat, send a talk and get a reply")
    @GetMapping("chat")
    public ResponseEntity chat(@RequestParam(required = true) String talk ) {
            return ResponseEntity.ok(ResponseBean.newInstance("HaHa"));

    }
}

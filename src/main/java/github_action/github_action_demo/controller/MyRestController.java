package github_action.github_action_demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class MyRestController {

    @GetMapping(path = "/employees")
    public ResponseEntity<Object> getEmp(){
        return ResponseEntity.accepted().body(Collections.singletonMap("empName", "Ashim Sarkar"));
    }
}

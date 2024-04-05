package esercizi.Deploy2.controllers;

import esercizi.Deploy2.services.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operation")
public class SumController {

    @Autowired
    private SumService sumService;

    @GetMapping("/randomSum")
    public ResponseEntity<Integer> sumOfTwoRandomInt(){
        return ResponseEntity.ok(sumService.sumOfTwoRandomInt());
    }

}

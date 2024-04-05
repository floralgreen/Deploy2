package esercizi.Deploy2.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SumService {

    public Integer sumOfTwoRandomInt(){
        Random generator = new Random();
        return generator.nextInt() + generator.nextInt();
    }

}

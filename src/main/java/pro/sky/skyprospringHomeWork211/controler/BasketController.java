package pro.sky.skyprospringHomeWork211.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringHomeWork211.service.BasketService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class BasketController {
    BasketService basketService;
    public BasketController (BasketService basketservice){
        this.basketService=basketservice;
    }

    @GetMapping("/add")
    public void addBasket(@RequestParam("id") ArrayList<Integer> list){
        basketService.addBasket( (ArrayList<Integer>) list);
    }
    @GetMapping("/get")
    public List<Integer> getBasket(){
        return basketService.getBasket();
    }

}

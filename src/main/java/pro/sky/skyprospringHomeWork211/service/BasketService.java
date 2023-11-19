package pro.sky.skyprospringHomeWork211.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@SessionScope
public class BasketService implements BasketServiceInterface{


    public List<Integer> basket;

 public BasketService(List<Integer> basket) {
     this.basket = basket;
 }
    public void addBasket(ArrayList<Integer> list){
        basket.addAll(list);
    }

    public List<Integer> getBasket(){
        return basket;
    }


}

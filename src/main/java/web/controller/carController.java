package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(("/cars"))
public class carController {
    private List<Car> carList(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada","Kalina",247));
        cars.add(new Car("Mercedes","Bens",457));
        cars.add(new Car("Lada","Priora",516));
        cars.add(new Car("Audi","A7",105));
        cars.add(new Car("Mazda","RX8",303));
        return cars;
    }

    @RequestMapping
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model){
       model.addAttribute("cars",carList().stream().limit(count).toList());
       return "cars";
    }
}

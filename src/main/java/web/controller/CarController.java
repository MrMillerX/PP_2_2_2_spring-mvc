package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    CarServiceImpl carService;

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model,
                            @RequestParam(value = "count", required = false) Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", "red", "1qwe23"));
        cars.add(new Car("BMW", "white", "7hgi95"));
        cars.add(new Car("Porsche", "yellow", "0gjm14"));
        cars.add(new Car("Honda", "black", "2asm05"));
        cars.add(new Car("Mercedes", "purple", "5pgs71"));
        model.addAttribute("cars", carService.returnCars(cars, count));
        return "carTable";
    }
}

package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping(value = "/cars")
public class CarController {


    @Autowired
    private CarService carService;

//// Выводим список всех машин на WEB страницу
//    @GetMapping()
//    public String index(Model model) {
//        model.addAttribute("list", carService.getCarServiceList());
//        return "indexCar";
//    }

    // Выводим список машин на WEB страницу взависимости от запроса
    @GetMapping()
    public String showCar(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count == null) {
            model.addAttribute("list", carService.getCarServiceList());
        } else if (count < 5 && count > 0) {
            model.addAttribute("list", carService.showCars(count, carService.getCarServiceList()));
        } else model.addAttribute("list", carService.getCarServiceList());

        return "indexCar";


    }
}
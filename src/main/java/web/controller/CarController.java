package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
//    public String printAllCars(@RequestParam(value = "count", required = false) int count, Model model) {
    public String printAllCars(@RequestParam(defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carService.listCars(count));
        return "cars";
    }

//    @GetMapping(value = "/cars")
//    public String printCars(@RequestParam(defaultValue="5") Integer count, ModelMap model) {
//        CarServiceImpl carsServiceImpl = new CarServiceImpl();
//        List<Car> qtyCars = carsServiceImpl.carList(count);
//        model.addAttribute("cars", qtyCars);
//        return "cars";
//}

}
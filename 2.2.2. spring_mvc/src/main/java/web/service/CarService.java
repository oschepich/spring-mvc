package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {

    @Autowired
    private CarDaoImpl carDao;

//    метод селекции списка машин взависимсти от заданных параметров
    public List<Car> showCars(int count, List<Car> carList) {
       return carList.stream().limit(count).collect(Collectors.toList());
    }
//  метод передачи всего списка машин
    public List<Car> getCarServiceList() {
        return carDao.getCarList();
    }
}

package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl {

    private List<Car> carList;

//    создаю список машин
    { carList = new ArrayList<>();
        carList.add(new Car("GAZ 2101","красный",1975));
        carList.add(new Car("GAZ 2318","зеленый",1970));
        carList.add(new Car("GAZ 3110","синий",1980));
        carList.add(new Car("GAZ 3131","белый",1990));
        carList.add(new Car("GAZ 3330","черный",1999));
    }
// метод передачи списка машин
    public List<Car> getCarList() {
        return carList;
    }


}

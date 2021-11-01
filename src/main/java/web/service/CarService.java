package web.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    List<Car> carList = new ArrayList<>();

    public CarService() {
        carList.add(new Car(1, "bmw", "135i"));
        carList.add(new Car(2, "bmw", "335i"));
        carList.add(new Car(3, "bmw", "535i"));
        carList.add(new Car(4, "bmw", "650i"));
        carList.add(new Car(5, "bmw", "750i"));
    }

    public List<Car> getCarList() {
        return carList;
    }

    public List<Car> getCarListWithParams(@RequestParam(value = "count", required = false) Integer count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}

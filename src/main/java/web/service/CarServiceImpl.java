package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW","Red",2012));
        cars.add(new Car("Bugatti","Black",2019));
        cars.add(new Car("Audi","Grey",2000));
        cars.add(new Car("Ferrari","Red",2018));
        cars.add(new Car("ВАЗ","Вищневый",2018));
    }

    @Override
    public List<Car> carList() {
        return cars;
    }
}

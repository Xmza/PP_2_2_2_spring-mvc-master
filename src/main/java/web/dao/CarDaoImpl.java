package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
    private final List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> carList(Integer count) {
        {
            cars.add(new Car("BMW","Red",2012));
            cars.add(new Car("Bugatti","Black",2019));
            cars.add(new Car("Audi","Grey",2000));
            cars.add(new Car("Ferrari","Red",2018));
            cars.add(new Car("ВАЗ","Вищневый",2018));
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}

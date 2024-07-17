package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars = new ArrayList<>();


    {
        cars.add(new Car("Toyota", "черный", 2018));
        cars.add(new Car("BMW", "белый", 2020));
        cars.add(new Car("Mazda", "красный", 2024));
        cars.add(new Car("Lada", "теракотовый", 2022));
        cars.add(new Car("Volga", "желтый", 2015));
    }


    @Override
    public List<Car> getCars(int count) {
        ;
        if (count == 0 || count > cars.size()) {
            return cars;
        }

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}

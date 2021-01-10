package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao {

    private static final List<Car> CARS = new ArrayList<>();

    static {
        for (int i = 1; i <= 5; i++) {
            CARS.add(new Car("Car_" + i, i, "Black"));
        }
    }

    @Override
    public List<Car> getCars(Integer carAmount) {
        return CARS.stream().limit(carAmount).collect(Collectors.toList());
    }

    @Override
    public List<Car> getCars() {
        return CARS;
    }
}

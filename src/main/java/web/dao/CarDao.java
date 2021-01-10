package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCars(Integer carAmount);
    List<Car> getCars();
}
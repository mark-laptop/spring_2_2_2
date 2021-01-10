package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> getCars(Integer carAmount) {
        if (carAmount == null || carAmount >= 5) {
            return carDao.getCars();
        } else {
            if (carAmount < 1) carAmount = 1;
            return carDao.getCars(carAmount);
        }
    }
}

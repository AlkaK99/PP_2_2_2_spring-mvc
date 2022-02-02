package web.service;

import com.sun.jdi.IntegerValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao carDao;
    @Override
    public List<Car> getListCar(int count){
        return carDao.getListCar().stream().limit(count).collect(Collectors.toList());
    }

}

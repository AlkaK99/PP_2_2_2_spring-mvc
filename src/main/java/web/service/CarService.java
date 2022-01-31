package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.controller.CarController;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarController carController;

    public List<Car> getListCar (Integer count) {
        List <Car> listCar = new ArrayList<>();
        listCar.add (new Car("Audi", "black", 5050));
        listCar.add(new Car("BMW", "Pink", 4343));
        listCar.add(new Car("Kia", "white",5555));
        listCar.add(new Car("Mazda","blue",99999));
        listCar.add(new Car("Ford","yellow", 89473));
        return ((count!=null) && count < listCar.size())? listCar.subList(0,count) : listCar;
    }

}

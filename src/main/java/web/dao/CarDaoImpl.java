package web.dao;
import org.springframework.stereotype.Repository;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

   @Override
   public List<Car> getListCar() {

        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("Audi", "black", 5050));
        listCar.add(new Car("BMW", "Pink", 4343));
        listCar.add(new Car("Kia", "white", 5555));
        listCar.add(new Car("Mazda", "blue", 99999));
        listCar.add(new Car("Ford", "yellow", 89473));
        return listCar;
    }
}

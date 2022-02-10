package web.Service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    List<Car> carList;

    @Override
    public List<Car> returnCars(Integer count) {
        carList = getCarList();
        if (count == null || count >= 5) {
            return carList;
        } else if (count <= 0) {
            return new ArrayList<Car>();
        } else {
            return carList.stream().limit(count).toList();
        }
    }

    public static List<Car> getCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", "red", "1qwe23"));
        cars.add(new Car("BMW", "white", "7hgi95"));
        cars.add(new Car("Porsche", "yellow", "0gjm14"));
        cars.add(new Car("Honda", "black", "2asm05"));
        cars.add(new Car("Mercedes", "purple", "5pgs71"));
        cars.add(new Car("Nissan", "orange", "7sdm91"));
        cars.add(new Car("Saab", "blue", "4pte56"));
        return cars;
    }
}

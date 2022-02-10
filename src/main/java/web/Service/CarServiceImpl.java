package web.Service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> returnCars(List<Car> carList, Integer count) {
        if (count != null) {
            return carList.stream().limit(count).toList();
        } else {
            return carList;
        }
    }
}

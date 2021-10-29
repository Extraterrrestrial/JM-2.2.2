package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Седан", "KIA Rio ", 2015));
        cars.add(new Car("Хэтчбек", "Chevrolet Lacetti", 2008));
        cars.add(new Car("Универсал", "Audi A4 allroad quattro", 2019));
        cars.add(new Car("Лифтбэк", "SKODA OCTAVIA", 2021));
        cars.add(new Car("Купе", "Nissan GT-R", 2010));
    }

    @Override
    public List<Car> listCars(int count) {
        if (count >= cars.size()) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
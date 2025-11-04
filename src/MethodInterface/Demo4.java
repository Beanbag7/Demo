package MethodInterface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Demo4 {
    public static void main(String[] args) {
        //理解构造器引用
        CarFactory cf = Car::new;

        Car car = cf.getCar("保时捷");
        System.out.println(car);

    };

}
@FunctionalInterface
interface CarFactory{
    Car getCar(String name);
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class Car{
    private String name;
}

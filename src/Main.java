import java.awt.*;
import java.awt.List;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception
    {
        LocalDate date = LocalDate.of(2021, 12, 21);
        LocalDate date2 = LocalDate.of(2020, 12, 21);
        LocalDate date3 = LocalDate.of(2019, 12, 21);

        Car porshe =new Car(date);
        Car lada =new Car(date2);
        Car BWM =new Car(date3);
        ArrayList<Car> cars=new ArrayList<>();
        cars.add(porshe);
        cars.add(lada);
        cars.add(BWM);

        Car newestCar = cars.stream()
                .max(Comparator.comparing(car -> car.getCreateDate()))
                .orElse(null);
        System.out.println(newestCar.toString());

    }


}




class Car
{
    @Override
    public String toString() {
        return "Car{" +
                "createDate=" + createDate +
                '}';
    }

    private LocalDate createDate;

    public Car(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
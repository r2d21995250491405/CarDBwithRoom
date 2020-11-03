package Data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import Model.Car;

@Dao
public interface CarDAO {
    @Insert
    public long AddCar(Car car);

    @Update
    public void UpdateCar(Car car);

    @Delete
    public void DeleteCar(Car car);

    @Query("select*from cars")
    public List<Car> getAllCars();

    @Query("select*from cars where car_id ==:carId ")
    public Car getCar(long carId);
}

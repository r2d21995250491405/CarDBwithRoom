package Data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import Model.Car;

@Database(entities = {Car.class}, version = 1)
public abstract class CarDataBase extends RoomDatabase {

    // Доступ к CarDAO для манипуляции с данными
    public abstract CarDAO getCarDAO();

}

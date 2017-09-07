package vn.tranty.vovinam.data.local.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import vn.tranty.vovinam.data.local.db.dao.LevelUpDao;
import vn.tranty.vovinam.data.local.db.dao.LevelUpHistoryDao;
import vn.tranty.vovinam.data.local.db.dao.UserDao;
import vn.tranty.vovinam.data.model.db.LevelUp;
import vn.tranty.vovinam.data.model.db.User;

/**
 * Created by PC on 9/7/2017.
 */
@Database(entities = {User.class, LevelUp.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDao();

    public abstract LevelUpDao levelUpDao();

    public abstract LevelUpHistoryDao levelUpHistoryDao();

}

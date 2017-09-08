package vn.tranty.vovinam.data.local.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import vn.tranty.vovinam.data.model.db.User;

/**
 * Created by PC on 9/7/2017.
 */
@Dao
public interface UserDao {
    @Query("SELECT * FROM users WHERE user_name LIKE :userName LIMIT 1")
    User findByUserName(String userName);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(User user);
}

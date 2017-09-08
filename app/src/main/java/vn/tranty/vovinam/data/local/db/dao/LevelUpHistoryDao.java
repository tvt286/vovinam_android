package vn.tranty.vovinam.data.local.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

import vn.tranty.vovinam.data.model.db.LevelUpHistory;

/**
 * Created by PC on 9/7/2017.
 */
@Dao
public interface LevelUpHistoryDao {
    @Query("SELECT * FROM levelup_histories WHERE id IN (:levelUpId)")
    List<LevelUpHistory> getAllById(int levelUpId);
}

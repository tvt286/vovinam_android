package vn.tranty.vovinam.data.local.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import vn.tranty.vovinam.data.model.db.LevelUp;

/**
 * Created by PC on 9/7/2017.
 */
@Dao
public interface LevelUpDao {
    @Query("SELECT * FROM level_up WHERE examination_id IN (:examinationId) AND company_id IN (:companyId)")
    List<LevelUp> getAll(int companyId, int examinationId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<LevelUp> levelUps);

    @Query("SELECT * FROM level_up WHERE id IN (:levelUpId)")
    LevelUp getById(int levelUpId);
}

package vn.tranty.vovinam.data.local.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

import vn.tranty.vovinam.data.model.db.LevelUp;

/**
 * Created by PC on 9/7/2017.
 */
@Dao
public interface LevelUpDao {
    @Query("SELECT * FROM level_up WHERE examination_id IN (:examinationId) AND company_id IN (:companyId)")
    List<LevelUp> getAllById(int companyId, int examinationId);
}

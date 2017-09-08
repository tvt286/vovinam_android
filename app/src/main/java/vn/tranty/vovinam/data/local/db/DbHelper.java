package vn.tranty.vovinam.data.local.db;

import java.util.List;

import io.reactivex.Observable;
import vn.tranty.vovinam.data.model.db.LevelUp;
import vn.tranty.vovinam.data.model.db.LevelUpHistory;
import vn.tranty.vovinam.data.model.db.User;

/**
 * Created by PC on 9/7/2017.
 */

public interface DbHelper {
    Observable<User> getUser(String userName);

    Observable<List<LevelUp>> getListLevelUp(int companyId, int examinationId);

    Observable<List<LevelUpHistory>> getListLevelUpHistory(int levelUpId);

    Observable<Boolean> insertListLevelUp(List<LevelUp> levelUpList);

    Observable<Boolean> insertUser(User user);

    Observable<LevelUp> getLevelUp(int levelUpId);

    Observable<Boolean> updateCoBan(int coBanId, int userId, float point);

    Observable<Boolean> updateQuyen(int quyenId, int userId, float point);

    Observable<Boolean> updateDoiKhang(int doiKhangId, int userId, float point);

    Observable<Boolean> updateTheluc(int theLucId, int userId, float point);

    Observable<Boolean> updateSongLuyen(int songLuyenId, int userId, float point);

    Observable<Boolean> updateVoDao(int voDaoId, int userId, float point);



}

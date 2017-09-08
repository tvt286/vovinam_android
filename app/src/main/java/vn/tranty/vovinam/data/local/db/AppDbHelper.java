package vn.tranty.vovinam.data.local.db;

import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.Observable;
import vn.tranty.vovinam.data.model.db.LevelUp;
import vn.tranty.vovinam.data.model.db.LevelUpHistory;
import vn.tranty.vovinam.data.model.db.User;

/**
 * Created by PC on 9/7/2017.
 * Đọc dữ liệu từ data nên sử dụng fromCallable()
 */

public class AppDbHelper implements DbHelper {
    private final AppDatabase mAppDatabase;

    public AppDbHelper(AppDatabase mAppDatabase) {
        this.mAppDatabase = mAppDatabase;
    }

    @Override
    public Observable<User> getUser(final String userName) {
        return Observable.fromCallable(new Callable<User>() {
            @Override
            public User call() throws Exception {
                return mAppDatabase.userDao().findByUserName(userName);
            }
        });
    }

    @Override
    public Observable<List<LevelUp>> getListLevelUp(int companyId, int examinationId) {
        return null;
    }

    @Override
    public Observable<List<LevelUpHistory>> getListLevelUpHistory(int levelUpId) {
        return null;
    }

    @Override
    public Observable<Boolean> insertListLevelUp(List<LevelUp> levelUpList) {
        return null;
    }

    @Override
    public Observable<Boolean> insertUser(User user) {
        return null;
    }

    @Override
    public Observable<LevelUp> getLevelUp(int levelUpId) {
        return null;
    }

    @Override
    public Observable<Boolean> updateCoBan(int coBanId, int userId, float point) {
        return null;
    }

    @Override
    public Observable<Boolean> updateQuyen(int quyenId, int userId, float point) {
        return null;
    }

    @Override
    public Observable<Boolean> updateDoiKhang(int doiKhangId, int userId, float point) {
        return null;
    }

    @Override
    public Observable<Boolean> updateTheluc(int theLucId, int userId, float point) {
        return null;
    }

    @Override
    public Observable<Boolean> updateSongLuyen(int songLuyenId, int userId, float point) {
        return null;
    }

    @Override
    public Observable<Boolean> updateVoDao(int voDaoId, int userId, float point) {
        return null;
    }
}

package vn.tranty.vovinam.data.remote;

import io.reactivex.Observable;
import vn.tranty.vovinam.data.model.api.levelup.LevelUpResponse;
import vn.tranty.vovinam.data.model.api.leveluphistory.LevelUpHistoryRespone;
import vn.tranty.vovinam.data.model.api.user.UserReponse;

/**
 * Created by TRUC-SIDA on 9/11/2017.
 */

public class AppApiHelper implements ApiHelper {

    @Override
    public Observable<UserReponse> doLoginApiCall() {
        return null;
    }

    @Override
    public Observable<LevelUpResponse> getLevelUpApiCall() {
        return null;
    }

    @Override
    public Observable<LevelUpHistoryRespone> getLevelUpHistoryApiCall() {
        return null;
    }

    @Override
    public Observable<Boolean> changePasswordApiCall(int userId, String password) {
        return null;
    }

    @Override
    public Observable<Boolean> UpdateVoDaoApiCall(int levelUpId, float point) {
        return null;
    }

    @Override
    public Observable<Boolean> UpdateQuyenApiCall(int levelUpId, float point) {
        return null;
    }

    @Override
    public Observable<Boolean> UpdateSongLuyenApiCall(int levelUpId, float point) {
        return null;
    }

    @Override
    public Observable<Boolean> UpdateCoBanApiCall(int levelUpId, float point) {
        return null;
    }

    @Override
    public Observable<Boolean> UpdateTheLucApiCall(int levelUpId, float point) {
        return null;
    }

    @Override
    public Observable<Boolean> UpdateDoiKhangApiCall(int levelUpId, float point) {
        return null;
    }
}

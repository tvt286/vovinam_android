package vn.tranty.vovinam.data.remote;

import io.reactivex.Observable;
import vn.tranty.vovinam.data.model.api.levelup.LevelUpResponse;
import vn.tranty.vovinam.data.model.api.leveluphistory.LevelUpHistoryRespone;
import vn.tranty.vovinam.data.model.api.user.UserReponse;

/**
 * Created by TRUC-SIDA on 9/11/2017.
 */

public interface ApiHelper {
    Observable<UserReponse> doLoginApiCall();

    Observable<LevelUpResponse> getLevelUpApiCall();

    Observable<LevelUpHistoryRespone> getLevelUpHistoryApiCall();

    Observable<Boolean> changePasswordApiCall(int userId, String password);

    Observable<Boolean> UpdateVoDaoApiCall(int levelUpId, float point);

    Observable<Boolean> UpdateQuyenApiCall(int levelUpId, float point);

    Observable<Boolean> UpdateSongLuyenApiCall(int levelUpId, float point);

    Observable<Boolean> UpdateCoBanApiCall(int levelUpId, float point);

    Observable<Boolean> UpdateTheLucApiCall(int levelUpId, float point);

    Observable<Boolean> UpdateDoiKhangApiCall(int levelUpId, float point);
}

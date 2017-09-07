package vn.tranty.vovinam.data.model.api.user;

import vn.tranty.vovinam.data.model.api.ApiError;

/**
 * Created by PC on 9/7/2017.
 */

public class UserReponse extends ApiError {
    private User data;

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }
}

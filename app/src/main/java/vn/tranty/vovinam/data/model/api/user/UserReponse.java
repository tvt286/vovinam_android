package vn.tranty.vovinam.data.model.api.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import vn.tranty.vovinam.data.model.api.ApiError;

/**
 * Created by PC on 9/7/2017.
 */

public class UserReponse extends ApiError {
    @Expose
    @SerializedName("data")
    private User data;

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }
}

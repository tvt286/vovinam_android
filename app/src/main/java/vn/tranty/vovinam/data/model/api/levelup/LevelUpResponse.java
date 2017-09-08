package vn.tranty.vovinam.data.model.api.levelup;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import vn.tranty.vovinam.data.model.api.ApiError;

/**
 * Created by TRUC-SIDA on 9/7/2017.
 */

public class LevelUpResponse extends ApiError {

    @Expose
    @SerializedName("data")
    private List<LevelUp> data;

    public List<LevelUp> getData() {
        return data;
    }

    public void setData(List<LevelUp> data) {
        this.data = data;
    }

}

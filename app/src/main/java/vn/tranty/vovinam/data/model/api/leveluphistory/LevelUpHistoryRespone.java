package vn.tranty.vovinam.data.model.api.leveluphistory;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import vn.tranty.vovinam.data.model.api.ApiError;

/**
 * Created by PC on 9/7/2017.
 */

public class LevelUpHistoryRespone extends ApiError{

    @Expose
    @SerializedName("data")
    private List<LevelUpHistory> data;

    public List<LevelUpHistory> getData() {
        return data;
    }

    public void setData(List<LevelUpHistory> data) {
        this.data = data;
    }
}

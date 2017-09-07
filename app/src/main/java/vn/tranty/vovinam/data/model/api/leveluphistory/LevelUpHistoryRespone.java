package vn.tranty.vovinam.data.model.api.leveluphistory;

import java.util.List;

import vn.tranty.vovinam.data.model.api.ApiError;

/**
 * Created by PC on 9/7/2017.
 */

public class LevelUpHistoryRespone extends ApiError{
    private List<LevelUpHistory> data;

    public List<LevelUpHistory> getData() {
        return data;
    }

    public void setData(List<LevelUpHistory> data) {
        this.data = data;
    }
}

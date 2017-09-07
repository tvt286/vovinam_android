package vn.tranty.vovinam.data.model.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by TRUC-SIDA on 9/7/2017.
 */


@Entity(tableName = "vo_dao")
public class VoDao {
    @Expose
    @SerializedName("id")
    public int id;

    @Expose
    @SerializedName("point")
    public float point;

    @Expose
    @SerializedName("user_id")
    @ColumnInfo(name = "user_id")
    public int userId;
}

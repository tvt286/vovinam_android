package vn.tranty.vovinam.data.model.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by TRUC-SIDA on 9/7/2017.
 */

@Entity(tableName = "levelup_histories")
public class LevelUpHistory {
    @Expose
    @SerializedName("id")
    @PrimaryKey
    public int id;

    @Expose
    @SerializedName("user_name")
    @ColumnInfo(name = "user_id")
    public String userName;

    @Expose
    @SerializedName("id")
    @ColumnInfo(name = "time_create")
    public String timeCreate;

    @Expose
    @SerializedName("level_up_id")
    @ColumnInfo(name = "level_up_id")
    public int LevelUpId;

    @Expose
    @SerializedName("name")
    @ColumnInfo(name = "name")
    public String name;

    @Expose
    @SerializedName("student_name")
    @ColumnInfo(name = "student_name")
    public String studentName;
    @Expose
    @SerializedName("point_old")
    @ColumnInfo(name = "point_old")
    public float pointOld;

    @Expose
    @SerializedName("point_new")
    @ColumnInfo(name = "point_new")
    public float pointNew;
}

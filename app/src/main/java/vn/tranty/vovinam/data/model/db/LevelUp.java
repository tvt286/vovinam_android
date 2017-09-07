package vn.tranty.vovinam.data.model.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by TRUC-SIDA on 9/7/2017.
 */
@Entity(tableName = "level_up")
public class LevelUp {
    @Expose
    @SerializedName("id")
    @PrimaryKey
    public int id;

    @Expose
    @SerializedName("stt")
    public int stt;

    @Expose
    @SerializedName("name")
    public String name;

    @Expose
    @SerializedName("birth_day")
    @ColumnInfo(name = "birth_day")
    public int birthDay;

    @Expose
    @SerializedName("gender")
    public String gender;

    @ColumnInfo(name = "club_id")
    public int clubId;

    @Expose
    @SerializedName("weight")
    public int weight;

    @Expose
    @SerializedName("examination_id")
    @ColumnInfo(name = "examination_id")
    public int examinationId;

    @Expose
    @SerializedName("quyen_id")
    @ColumnInfo(name = "quyen_id")
    public int quyenId;

    @Expose
    @SerializedName("co_ban_id")
    @ColumnInfo(name = "co_ban_id")
    public int coBanId;

    @Expose
    @SerializedName("the_luc_id")
    @ColumnInfo(name = "the_luc_id")
    public int theLucId;

    @Expose
    @SerializedName("vo_dao_id")
    @ColumnInfo(name = "vo_dao_id")
    public int voDaoId;

    @Expose
    @SerializedName("song_luyen_id")
    @ColumnInfo(name = "song_luyen_id")
    public int songLuyenId;

    @Expose
    @SerializedName("doi_khang_id")
    @ColumnInfo(name = "doi_khang_id")
    public int DoiKhangId;

    @Expose
    @SerializedName("company_id")
    @ColumnInfo(name = "company_id")
    public int CompanyId;

    @Expose
    @SerializedName("total")
    public float total;

    @Expose
    @SerializedName("has_compete")
    @ColumnInfo(name = "has_compete")
    public boolean hasCompete;

    @Expose
    @SerializedName("ket_qua")
    @ColumnInfo(name = "ket_qua")
    public String ketQua;
}

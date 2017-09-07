package vn.tranty.vovinam.data.model.api.levelup;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by TRUC-SIDA on 9/7/2017.
 */

public class LevelUpResponse {
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
    public int examinationId;

    @Expose
    @SerializedName("quyen_id")
    public int quyenId;

    @Expose
    public int coBanId;

    @Expose
    public int theLucId;

    @Expose
    @SerializedName("vo_dao_id")
    public int voDaoId;

    @Expose
    @SerializedName("song_luyen_id")
    public int songLuyenId;

    @Expose
    @SerializedName("doi_khang_id")
    public int DoiKhangId;

    @Expose
    @SerializedName("company_id")
    public int CompanyId;

    @Expose
    public float total;

    @Expose
    @SerializedName("has_compete")
    public boolean hasCompete;

    @Expose
    @SerializedName("ket_qua")
    public String ketQua;

    public static class CoBan {

    }
}

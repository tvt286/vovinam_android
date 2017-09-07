package vn.tranty.vovinam.data.model.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by TRUC-SIDA on 9/7/2017.
 */
@Entity(tableName = "levelups")
public class LevelUp {
    @PrimaryKey
    public int id;

    public int stt;

    public String name;

    @ColumnInfo(name = "birth_day")
    public int birthDay;

    public String gender;

    @ColumnInfo(name = "club_id")
    public int clubId;

    public int weight;

    @ColumnInfo(name = "examination_id")
    public int examinationId;

    @ColumnInfo(name = "quyen_id")
    public int quyenId;

    @ColumnInfo(name = "co_ban_id")
    public int coBanId;

    @ColumnInfo(name = "the_luc_id")
    public int theLucId;

    @ColumnInfo(name = "vo_dao_id")
    public int voDaoId;

    @ColumnInfo(name = "song_luyen_id")
    public int songLuyenId;

    @ColumnInfo(name = "doi_khang_id")
    public int DoiKhangId;

    @ColumnInfo(name = "company_id")
    public int CompanyId;

    public float total;

    @ColumnInfo(name = "has_compete")
    public boolean hasCompete;

    @ColumnInfo(name = "ket_qua")
    public String ketQua;
}

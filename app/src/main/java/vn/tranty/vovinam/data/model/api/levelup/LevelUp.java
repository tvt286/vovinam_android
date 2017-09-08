package vn.tranty.vovinam.data.model.api.levelup;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by TRUC-SIDA on 9/8/2017.
 */

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
    @SerializedName("quyen")
    @ColumnInfo(name = "quyen")
    public Quyen quyen;

    @Expose
    @SerializedName("co_ban")
    public CoBan coBan;

    @Expose
    @SerializedName("the_luc")
    public TheLuc theLuc;

    @Expose
    @SerializedName("vo_dao")
    public VoDao voDao;

    @Expose
    @SerializedName("song_luyen")
    public SongLuyen songLuyen;

    @Expose
    @SerializedName("doi_khang_")
    public DoiKhang doiKhang;

    @Expose
    @SerializedName("company_id")
    public int CompanyId;

    @Expose
    @SerializedName("total")
    public float total;

    @Expose
    @SerializedName("has_compete")
    public boolean hasCompete;

    @Expose
    @SerializedName("ket_qua")
    public String ketQua;

    public static class CoBan {
        @Expose
        @SerializedName("id")
        private int id;

        @Expose
        @SerializedName("point")
        private float point;

        @Expose
        @SerializedName("user_name")
        private String userName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public float getPoint() {
            return point;
        }

        public void setPoint(float point) {
            this.point = point;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }

    public static class Quyen {
        @Expose
        @SerializedName("id")
        private int id;

        @Expose
        @SerializedName("point")
        private float point;

        @Expose
        @SerializedName("user_name")
        private String userName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public float getPoint() {
            return point;
        }

        public void setPoint(float point) {
            this.point = point;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }

    public static class DoiKhang {
        @Expose
        @SerializedName("id")
        private int id;

        @Expose
        @SerializedName("point")
        private float point;

        @Expose
        @SerializedName("user_name")
        private String userName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public float getPoint() {
            return point;
        }

        public void setPoint(float point) {
            this.point = point;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }

    public static class TheLuc {
        @Expose
        @SerializedName("id")
        private int id;

        @Expose
        @SerializedName("point")
        private float point;

        @Expose
        @SerializedName("user_name")
        private String userName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public float getPoint() {
            return point;
        }

        public void setPoint(float point) {
            this.point = point;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }

    public static class SongLuyen {
        @Expose
        @SerializedName("id")
        private int id;

        @Expose
        @SerializedName("point")
        private float point;

        @Expose
        @SerializedName("user_name")
        private String userName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public float getPoint() {
            return point;
        }

        public void setPoint(float point) {
            this.point = point;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }

    public static class VoDao {
        @Expose
        @SerializedName("id")
        private int id;

        @Expose
        @SerializedName("point")
        private float point;

        @Expose
        @SerializedName("user_name")
        private String userName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public float getPoint() {
            return point;
        }

        public void setPoint(float point) {
            this.point = point;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }

}

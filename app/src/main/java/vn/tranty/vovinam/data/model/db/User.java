package vn.tranty.vovinam.data.model.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by TRUC-SIDA on 9/7/2017.
 */

@Entity(tableName = "users")
public class User {

    @Expose
    @SerializedName("id")
    @PrimaryKey
    public int id;

    @Expose
    @SerializedName("user_name")
    @ColumnInfo(name = "user_name")
    public String userName;

    @Expose
    @SerializedName("full_name")
    @ColumnInfo(name = "full_name")
    public String fullName;

    @Expose
    @SerializedName("email")
    public String email;

    @Expose
    @SerializedName("phone")
    public String phone;

    @Expose
    @SerializedName("image")
    public String image;

    @Expose
    @SerializedName("company_id")
    @ColumnInfo(name = "company_id")
    public String companyId;

}

package vn.tranty.vovinam.data.model.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by TRUC-SIDA on 9/7/2017.
 */

@Entity(tableName = "users")
public class User {
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "user_name")
    public String userName;

    @ColumnInfo(name = "full_name")
    public String fullName;

    public String email;

    public String phone;

    public String image;

    @ColumnInfo(name = "company_id")
    public String companyId;

}

package vn.tranty.vovinam.data.model.api.leveluphistory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by PC on 9/7/2017.
 */

public class LevelUpHistory {
    @Expose
    @SerializedName("id")
    private int id;

    @Expose
    @SerializedName("user_name")
    private String userName;

    @Expose
    @SerializedName("id")
    private String timeCreate;

    @Expose
    @SerializedName("level_up_id")
    private int LevelUpId;

    @Expose
    @SerializedName("name")
    private String name;

    @Expose
    @SerializedName("student_name")
    private String studentName;
    @Expose
    @SerializedName("point_old")
    private float pointOld;

    @Expose
    @SerializedName("point_new")
    private float pointNew;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(String timeCreate) {
        this.timeCreate = timeCreate;
    }

    public int getLevelUpId() {
        return LevelUpId;
    }

    public void setLevelUpId(int levelUpId) {
        LevelUpId = levelUpId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getPointOld() {
        return pointOld;
    }

    public void setPointOld(float pointOld) {
        this.pointOld = pointOld;
    }

    public float getPointNew() {
        return pointNew;
    }

    public void setPointNew(float pointNew) {
        this.pointNew = pointNew;
    }
}

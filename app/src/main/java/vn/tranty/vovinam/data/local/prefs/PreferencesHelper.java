package vn.tranty.vovinam.data.local.prefs;

/**
 * Created by TRUC-SIDA on 9/11/2017.
 */

public interface PreferencesHelper {


    Long getCurrentUserId();

    void setCurrentUserId(int userId);

    String getCurrentUserName();

    void setCurrentUserName(String userName);

    String getCurrentPassword();

    void setCurrentPassword(String password);

    String getCurrentUserEmail();

    void setCurrentUserEmail(String email);

    String getCurrentUserProfilePicUrl();

    void setCurrentUserProfilePicUrl(String profilePicUrl);


}

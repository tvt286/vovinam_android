package vn.tranty.vovinam.ultils;

/**
 * Created by TRUC-SIDA on 9/11/2017.
 */
public final class AppConstants {

    private AppConstants() {
        // This utility class is not publicly instantiable
    }

    public static final String STATUS_CODE_SUCCESS = "success";
    public static final String STATUS_CODE_FAILED = "failed";

    public static final int API_STATUS_CODE_LOCAL_ERROR = 0;

    public static final String DB_NAME = "mindorks_mvvm.db";
    public static final String PREF_NAME = "mindorks_pref";

    public static final int NULL_INDEX = 0;

    public static final String SEED_DATABASE_OPTIONS = "seed/options.json";
    public static final String SEED_DATABASE_QUESTIONS = "seed/questions.json";

    public static final String TIMESTAMP_FORMAT = "yyyyMMdd_HHmmss";
}
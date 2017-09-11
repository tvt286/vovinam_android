package vn.tranty.vovinam.data.local;

import vn.tranty.vovinam.data.local.db.DbHelper;
import vn.tranty.vovinam.data.local.prefs.PreferencesHelper;
import vn.tranty.vovinam.data.remote.ApiHelper;

/**
 * Created by TRUC-SIDA on 9/11/2017.
 */

public interface DataManager  extends DbHelper, PreferencesHelper, ApiHelper {

}

package think.boring.view.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import think.common.router.RouterUtil;

/**
 * @author think
 * @date 2018/1/15 下午5:35
 */

public class LauncherActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RouterUtil.getRouter().toMain(this);
        finish();
    }
}

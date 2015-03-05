package com.ziliang.NerdLauncher;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

public class NerdLauncherActivity extends SingleFragmentActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public Fragment createFragment(){
        return new NerdLauncherFragment();
    }
}

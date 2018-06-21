package com.test.tnojc.sub;

import android.app.Fragment;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Resources resources = null;
        try {
            resources = getActivity().getPackageManager().getResourcesForApplication("com.test.tnojc.sub");
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return inflater.inflate(resources.getLayout(R.layout.fragment_my), container, false);
    }

}

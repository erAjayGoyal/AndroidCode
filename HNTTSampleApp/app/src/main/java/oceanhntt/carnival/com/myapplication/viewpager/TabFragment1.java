package oceanhntt.carnival.com.myapplication.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import oceanhntt.carnival.com.myapplication.R;

/**
 * Created by ajay.goyal on 9/18/2017.
 */

public class TabFragment1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_fragment_1, container, false);
    }
}

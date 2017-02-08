package com.example.satriowibowo.checkindomaret;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by qalbins on 04/02/2017.
 */

public class LoginContentFragment extends Fragment implements View.OnClickListener {
    private Button mLogin;
    private TextView mRegis;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.item_login, container, false);
        mRegis = (TextView) v.findViewById(R.id.link_signup);
        mRegis.setOnClickListener(LoginContentFragment.this);
        return v;
    }

    @Override
    public void onClick(View v) {
//        RegisContentFragment regisContentFragment = new RegisContentFragment();
//        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.fraglogin, regisContentFragment);
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
        Intent intent = new Intent(getActivity(), RegisActivity.class);
        startActivity(intent);
    }
}

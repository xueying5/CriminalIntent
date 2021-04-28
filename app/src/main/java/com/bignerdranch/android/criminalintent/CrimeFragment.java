package com.bignerdranch.android.criminalintent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class CrimeFragment extends Fragment {

    private Crime mCrime;
    private EditText mTitleField;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }*/
        mCrime = new Crime();
    }

    /**
     *
     * @param inflater 用于生成视图view
     * @param container 视图的父视图
     * @param savedInstanceState 保存视图数据供后续恢复视图
     * @return 创建好的视图
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_crime,    // 布局的资源文件（ID）
                container,                                  // 父视图
                false                          // 告诉视图生成器是否将生成的视图添加到父视图
        );
        mTitleField = view.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // 先置空
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCrime.setTitle(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                // 也是先置空
            }
        });
        return view;
    }
}
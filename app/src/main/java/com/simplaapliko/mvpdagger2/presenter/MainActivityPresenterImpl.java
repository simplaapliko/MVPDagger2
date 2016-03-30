/*
 * Copyright (C) 2016 Oleg Kan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.simplaapliko.mvpdagger2.presenter;

import android.support.annotation.NonNull;

import com.simplaapliko.mvpdagger2.data.DataRepository;

public class MainActivityPresenterImpl implements MainActivityPresenter {

    private DataRepository mDataRepository;
    //@Inject SharedPreferences mSharedPreferences;

    private View mView;

    public MainActivityPresenterImpl() {
        // empty
    }

    @Override
    public void setView(@NonNull View view) {
        mView = view;
    }

    @Override
    public void setDataRepository(@NonNull DataRepository dataRepository) {
        mDataRepository = dataRepository;
    }

    @Override
    public void onGetAppNameButtonClick() {
        mView.setAppName("test");

        // test DataRepository injection
        String appName = mDataRepository.getAppName();
        mView.setAppName(appName);

        // test SharedPreferences injection
        //mSharedPreferences.getAll();
    }
}

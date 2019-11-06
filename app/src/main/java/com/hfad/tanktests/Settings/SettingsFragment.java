package com.hfad.tanktests.Settings;


import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;

import com.hfad.tanktests.R;


// фрагмент для макета с настройками

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.settings_fragment);       // макет с настройками

        // получаем SharedPreferences
        SharedPreferences sharedPreferences_obj = getPreferenceScreen().getSharedPreferences();

        PreferenceScreen preferenceScreen_obj =getPreferenceScreen();   // экран с настройками

        int count = preferenceScreen_obj.getPreferenceCount(); // количество настроек

        for (int i = 0; i < count; i++){
            Preference preference_obj =preferenceScreen_obj.getPreference(i);   // получаем i настройку
        }
    }



}

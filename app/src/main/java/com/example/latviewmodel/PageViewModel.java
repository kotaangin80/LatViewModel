package com.example.latviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {
    private MutableLiveData<String> mName = new MutableLiveData<>();
    private MutableLiveData<String> mUmur = new MutableLiveData<>();
    private MutableLiveData<String> mNotelp = new MutableLiveData<>();
    private MutableLiveData<String> mAlamat = new MutableLiveData<>();

    public void setName(String name) {
        mName.setValue(name);
    }
    public LiveData<String> getName() {
        return mName;
    }

    public void setUmur(String umur) {
       mUmur.setValue(umur);
    }
    public LiveData<String> getUmur() {
        return mUmur;
    }

    public void setNotelp(String notelp) {
        mNotelp.setValue(notelp);
    }
    public LiveData<String> getNotelp() { return mNotelp; }

    public void setAlamat(String alamat) {
        mAlamat.setValue(alamat);
    }
    public LiveData<String> getAlamat() {
        return mAlamat;
    }
}
package com.example.latviewmodel;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.material.textfield.TextInputEditText;

public class fragment_first extends Fragment {
    private PageViewModel pageViewModel;
    public fragment_first() {
// Required empty public constructor
    }
    /**
     * Create a new instance of this fragment
     * @return A new instance of fragment FirstFragment.
     */
    public static fragment_first newInstance() {
        return new fragment_first();
    }
    @Override public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// init ViewModel
        pageViewModel =
                ViewModelProviders.of(requireActivity()).get(PageViewModel.class);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
    @Override public void onViewCreated(@NonNull View view, @Nullable
            Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextInputEditText nameEditText =
                view.findViewById(R.id.textInputTextName);
        TextInputEditText umurEditText =
                view.findViewById(R.id.textInputTextumur);
        TextInputEditText notelpEditText =
                view.findViewById(R.id.textInputTextnotelp);
        TextInputEditText alamatEditText =
                view.findViewById(R.id.textInputTextalamat);
// Add Text Watcher on name input text
        nameEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int
                    i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i,
                                                int i1, int i2) {
                pageViewModel.setName(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });
        umurEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int
                    i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i,
                                                int i1, int i2) {
                pageViewModel.setUmur(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });
        notelpEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int
                    i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i,
                                                int i1, int i2) {
                pageViewModel.setNotelp(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });
        alamatEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int
                    i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i,
                                                int i1, int i2) {
                pageViewModel.setAlamat(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });
    }
}
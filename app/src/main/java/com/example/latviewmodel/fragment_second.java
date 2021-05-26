package com.example.latviewmodel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
public class fragment_second extends Fragment {
    private PageViewModel pageViewModel;
    private TextView txtName;
    private TextView txtName2;
    private TextView txtName3;
    private TextView txtName4;
    public fragment_second () {
// Required empty public constructor
    }
    /**
     * Use this factory method to create a new instance of this fragment.
     *
     * @return A new instance of fragment SecondFragment.
     */
    public static fragment_second newInstance() {
        return new fragment_second();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// initialise ViewModel here
        pageViewModel =
                ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override

    public void onViewCreated(@NonNull View view, @Nullable Bundle
            savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtName = view.findViewById(R.id.textViewName);
        txtName2 = view.findViewById(R.id.textViewName2);
        txtName3 = view.findViewById(R.id.textViewName3);
        txtName4 = view.findViewById(R.id.textViewName4);
        pageViewModel.getName().observe(requireActivity(), new Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtName.setText(s);

                    }
                }
                );
        pageViewModel.getUmur().observe(requireActivity(), new Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtName2.setText(s);

                    }
                }
        );
        pageViewModel.getNotelp().observe(requireActivity(), new Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtName3.setText(s);

                    }
                }
        );
        pageViewModel.getAlamat().observe(requireActivity(), new Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtName4.setText(s);

                    }
                }
        );
    }
}
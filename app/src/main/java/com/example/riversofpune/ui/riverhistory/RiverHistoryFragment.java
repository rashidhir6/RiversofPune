package com.example.riversofpune.ui.riverhistory;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.riversofpune.R;

public class RiverHistoryFragment extends Fragment {

    private RiverHistoryViewModel riverHistoryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        riverHistoryViewModel =
                ViewModelProviders.of(this).get(RiverHistoryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_history, container, false);

        WebView webView = getActivity().findViewById(R.id.history_webview);
        webView.loadUrl("www.google.com");
        return root;
    }
}
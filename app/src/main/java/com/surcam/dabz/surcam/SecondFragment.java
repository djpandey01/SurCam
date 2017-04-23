package com.surcam.dabz.surcam;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    public WebView kWebView;
    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_second, container, false);
        kWebView = (WebView) v.findViewById(R.id.web2);
        kWebView.loadUrl("http://192.168.0.4");

        // Enable Javascript
        WebSettings webSettings = kWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        kWebView.setWebViewClient(new WebViewClient());

        return v;
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_second, container, false);
    }

}

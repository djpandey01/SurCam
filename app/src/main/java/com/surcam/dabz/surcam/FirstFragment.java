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
public class FirstFragment extends Fragment {
public WebView mWebView;

    public FirstFragment() {
        // Required empty public constructor
    }







    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_first, container, false);
        mWebView = (WebView) v.findViewById(R.id.web1);
        mWebView.loadUrl("http://192.168.0.100/video.cgi/");
        //mWebView.loadUrl("http://google.com/");

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());

        return v;
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_first, container, false);
    }

}

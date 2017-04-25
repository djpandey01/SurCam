package com.surcam.dabz.surcam;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.HttpAuthHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static android.R.attr.host;


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
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
       mWebView.loadUrl("http://192.168.0.100/video.cgi/");
        //mWebView.loadUrl("http://192.168.0.100/mjpeg.cgi?user=%22admin%22&password=%22%22&channel=6");

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
       //mWebView.getSettings().setUseWideViewPort(true);
         webSettings.setLoadWithOverviewMode(true);
       webSettings.setBuiltInZoomControls(true);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient()
                                  {
                                      public void onReceivedHttpAuthRequest(WebView view, HttpAuthHandler handler, String host, String realm) {
                                          handler.proceed("admin", "");
                                      }
                                  }
        );



        return v;
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_first, container, false);
    }





}

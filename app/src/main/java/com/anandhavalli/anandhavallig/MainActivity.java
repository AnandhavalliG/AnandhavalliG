package com.anandhavalli.anandhavallig;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.link)
    public void okAction(View view) {
        launchPlayStore();
    }

    private void launchPlayStore() {
        Uri uri = Uri.parse("https://play.google.com/store/apps/developer?id=Anandhavalli+G");
        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
        try {
            startActivity(goToMarket);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.soft.niuyi.glideimageloader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.soft.niuyi.glideimageloader.loader.ImageLoaderEngine;
import com.soft.niuyi.glideimageloader.loader.ImageLoaderOptions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageLoaderOptions options = new ImageLoaderOptions.Builder()
                .errorDrawable(R.mipmap.ic_launcher)
                .placeHolder(R.mipmap.ic_launcher)
                .build();

        ImageLoaderEngine.getInstance().showImage(findViewById(R.id.image), "http://image.sports.baofeng.com/25a3dbb0c99c5e48e52e60941ed230be", options);
    }
}

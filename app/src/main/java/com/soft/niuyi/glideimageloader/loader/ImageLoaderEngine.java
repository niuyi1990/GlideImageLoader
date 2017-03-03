package com.soft.niuyi.glideimageloader.loader;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * 作者：${牛毅}
 * 时间：2017/02/28 09：34
 * 邮箱：niuyi19900923@gmail.com
 * 描述：单例模式的图片加载引擎
 */
public class ImageLoaderEngine implements ImageLoaderInterface {

    private static volatile ImageLoaderEngine instance = null;

    private ImageLoaderInterface imageLoader;

    private ImageLoaderEngine() {
        //默认使用Glide
        imageLoader = new GlideImageLoader();
    }

    public static ImageLoaderEngine getInstance() {
        if (instance == null) {
            synchronized (ImageLoaderEngine.class) {
                if (instance == null) {
                    instance = new ImageLoaderEngine();
                }
            }
        }
        return instance;
    }

    //可实时替换图片加载框架，默认使用Glide
    public void setImageLoader(ImageLoaderInterface loader) {
        if (loader != null) {
            imageLoader = loader;
        }
    }

    @Override
    public void showImage(@NonNull View mView, @NonNull String mUrl, @Nullable ImageLoaderOptions options) {
        imageLoader.showImage(mView, mUrl, options);
    }


    @Override
    public void showImage(@NonNull View mView, @NonNull int mDraeable, @Nullable ImageLoaderOptions options) {
        imageLoader.showImage(mView, mDraeable, options);
    }

}

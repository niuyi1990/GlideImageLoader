package com.soft.niuyi.glideimageloader.loader;

import android.view.View;

/**
 * 作者：${牛毅}
 * 时间：2017/02/28 09：31
 * 邮箱：niuyi19900923@gmail.com
 * 描述：统一封装的图片加载接口
 */
public interface ImageLoaderInterface {
    void showImage(View v, String url, ImageLoaderOptions options);

    void showImage(View v, int drawable, ImageLoaderOptions options);
}

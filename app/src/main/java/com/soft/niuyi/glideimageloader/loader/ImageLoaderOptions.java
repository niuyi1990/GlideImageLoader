package com.soft.niuyi.glideimageloader.loader;

import com.bumptech.glide.request.animation.ViewPropertyAnimation;

/**
 * 作者：${牛毅}
 * 时间：2017/02/28 09：27
 * 邮箱：niuyi19900923@gmail.com
 * 描述：Builder模式的图片Glide的各种设置
 */
public class ImageLoaderOptions {

    private int placeHolder = -1; //当没有成功加载的时候显示的图片
    private ImageReSize size = null; //重新设定容器宽高
    private int errorDrawable = -1;  //加载错误的时候显示的drawable
    private boolean isCrossFade = false; //是否渐变平滑的显示图片
    private boolean isSkipMemoryCache = false; //是否跳过内存缓存
    private ViewPropertyAnimation.Animator animator = null; // 图片加载动画
    private int mPlaceHolder;
    private int mErrorDrawable;
    private boolean mCrossFade;
    private boolean mSkipMemoryCache;
    private ImageReSize mSize;

    private ImageLoaderOptions(Builder builder) {
        this.placeHolder = builder.placeHolder;
        this.size = builder.size;
        this.errorDrawable = builder.errorDrawable;
        this.isCrossFade = builder.isCrossFade;
        this.isSkipMemoryCache = builder.isSkipMemoryCache;
        this.animator = builder.animator;
    }

    public ImageReSize getSize() {
        return mSize;
    }

    public ImageLoaderOptions setSize(ImageReSize size) {
        this.size = size;
        return this;
    }

    public ViewPropertyAnimation.Animator getAnimator() {
        return animator;
    }

    public ImageLoaderOptions setAnimator(ViewPropertyAnimation.Animator animator) {
        this.animator = animator;
        return this;
    }

    public int getPlaceHolder() {
        return mPlaceHolder;
    }

    public ImageLoaderOptions setPlaceHolder(int placeHolder) {
        mPlaceHolder = placeHolder;
        return this;
    }

    public int getErrorDrawable() {
        return mErrorDrawable;
    }

    public ImageLoaderOptions setErrorDrawable(int errorDrawable) {
        mErrorDrawable = errorDrawable;
        return this;
    }

    public boolean isCrossFade() {
        return mCrossFade;
    }

    public ImageLoaderOptions setCrossFade(boolean crossFade) {
        mCrossFade = crossFade;
        return this;
    }

    public boolean isSkipMemoryCache() {
        return mSkipMemoryCache;
    }

    public ImageLoaderOptions setSkipMemoryCache(boolean skipMemoryCache) {
        mSkipMemoryCache = skipMemoryCache;
        return this;
    }

    public class ImageReSize {
        int reWidth = 0;
        int reHeight = 0;

        public ImageReSize(int reWidth, int reHeight) {
            if (reHeight <= 0) {
                reHeight = 0;
            }
            if (reWidth <= 0) {
                reWidth = 0;
            }
            this.reHeight = reHeight;
            this.reWidth = reWidth;

        }
    }

    public static final class Builder {
        private int placeHolder = -1;
        private ImageReSize size = null;
        private int errorDrawable = -1;
        private boolean isCrossFade = false;
        private boolean isSkipMemoryCache = false;
        private ViewPropertyAnimation.Animator animator = null;

        public Builder placeHolder(int drawable) {
            this.placeHolder = drawable;
            return this;
        }

        public Builder reSize(ImageReSize size) {
            this.size = size;
            return this;
        }

        public Builder anmiator(ViewPropertyAnimation.Animator animator) {
            this.animator = animator;
            return this;
        }

        public Builder errorDrawable(int errorDrawable) {
            this.errorDrawable = errorDrawable;
            return this;
        }

        public Builder isCrossFade(boolean isCrossFade) {
            this.isCrossFade = isCrossFade;
            return this;
        }

        public Builder isSkipMemoryCache(boolean isSkipMemoryCache) {
            this.isSkipMemoryCache = isSkipMemoryCache;
            return this;
        }

        public ImageLoaderOptions build() {
            return new ImageLoaderOptions(this);
        }
    }
}
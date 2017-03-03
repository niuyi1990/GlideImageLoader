# GlideImageLoader
简单的封装统一的图片加载器GlideImageLoader
##使用如下

        ImageLoaderOptions options = new ImageLoaderOptions.Builder()
                .errorDrawable(R.mipmap.ic_launcher)
                .placeHolder(R.mipmap.ic_launcher)
                .build();

        ImageLoaderEngine.getInstance().showImage(findViewById(R.id.image), "http://image.sports.baofeng.com/25a3dbb0c99c5e48e52e60941ed230be", options);

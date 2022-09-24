package com.atguigu.shoppingmall.home.uitls;

import android.support.v4.view.ViewPager;
import android.view.View;

public class NonPageTransformer implements ViewPager.PageTransformer
{
    @Override
    public void transformPage(View page, float position)
    {
        page.setScaleX(0.8f);//hack
    }

    public static final ViewPager.PageTransformer INSTANCE = new NonPageTransformer();
}

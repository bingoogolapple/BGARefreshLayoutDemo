package cn.bingoogolapple.bgarefreshlayoutdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import cn.bingoogolapple.bgaindicator.BGAFixedIndicator;
import cn.bingoogolapple.bgarefreshlayoutdemo.R;
import cn.bingoogolapple.bgarefreshlayoutdemo.fragment.MeiTuanListViewFragment;
import cn.bingoogolapple.bgarefreshlayoutdemo.fragment.MoocRecyclerViewFragment;
import cn.bingoogolapple.bgarefreshlayoutdemo.fragment.NormalListViewFragment;
import cn.bingoogolapple.bgarefreshlayoutdemo.fragment.StickinessRecyclerViewFragment;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:15/9/27 下午9:44
 * 描述:测试Activity嵌套ViewPager嵌套Fragment嵌套BGARefreshLayout
 */
public class MainActivity extends BaseActivity {
    public static final int LOADING_DURATION = 2000;
    private BGAFixedIndicator mIndicator;
    private ViewPager mContentVp;
    private Fragment[] mFragments;
    private String[] mTitles;

    @Override
    protected void initView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        mIndicator = getViewById(R.id.indicator);
        mContentVp = getViewById(R.id.vp_main_content);
    }

    @Override
    protected void setListener() {
    }

    @Override
    protected void processLogic(Bundle savedInstanceState) {
        setTitle("测A嵌VP嵌F");
        mFragments = new Fragment[4];
        mFragments[0] = new NormalListViewFragment();
        mFragments[1] = new MeiTuanListViewFragment();
        mFragments[2] = new MoocRecyclerViewFragment();
        mFragments[3] = new StickinessRecyclerViewFragment();

        mTitles = new String[4];
        mTitles[0] = "Normal";
        mTitles[1] = "MeiTuan";
        mTitles[2] = "Mooc";
        mTitles[3] = "Stickiness";
        mContentVp.setAdapter(new ContentViewPagerAdapter(getSupportFragmentManager()));
        mIndicator.initData(0, mContentVp);
    }

    public void testAFVPF(View v) {
        startActivity(new Intent(this, AFVPFActivity.class));
    }

    public void testAFF(View v) {
        startActivity(new Intent(this, AFFActivity.class));
    }

    class ContentViewPagerAdapter extends FragmentPagerAdapter {

        public ContentViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return mTitles.length;
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments[position];
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitles[position];
        }
    }

}

package cn.bingoogolapple.bgarefreshlayoutdemo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import cn.bingoogolapple.bgaindicator.BGAFixedIndicator;
import cn.bingoogolapple.bgarefreshlayoutdemo.R;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:15/11/17 下午10:01
 * 描述:
 */
public class AFVPFFragment extends BaseFragment {
    private BGAFixedIndicator mIndicator;
    private ViewPager mContentVp;
    private Fragment[] mFragments;
    private String[] mTitles;

    @Override
    protected void initView(Bundle savedInstanceState) {
        setContentView(R.layout.fragment_afvpf);
        mIndicator = getViewById(R.id.indicator);
        mContentVp = getViewById(R.id.vp_nest_content);
    }

    @Override
    protected void setListener() {

    }

    @Override
    protected void processLogic(Bundle savedInstanceState) {
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
        mContentVp.setAdapter(new ContentViewPagerAdapter(getChildFragmentManager()));
        mIndicator.initData(0, mContentVp);
    }

    @Override
    protected void onUserVisible() {
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

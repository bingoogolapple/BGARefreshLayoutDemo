package cn.bingoogolapple.bgarefreshlayoutdemo.activity;

import android.os.Bundle;

import cn.bingoogolapple.bgarefreshlayoutdemo.R;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:15/9/27 下午9:44
 * 描述:测试Activity嵌套Fragment嵌套ViewPager嵌套Fragment嵌套BGARefreshLayout
 */
public class AFVPFActivity extends BaseActivity {

    @Override
    protected void initView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_afvpf);
    }

    @Override
    protected void setListener() {
    }

    @Override
    protected void processLogic(Bundle savedInstanceState) {
        setTitle("测试A嵌F嵌VP嵌F");
    }

}
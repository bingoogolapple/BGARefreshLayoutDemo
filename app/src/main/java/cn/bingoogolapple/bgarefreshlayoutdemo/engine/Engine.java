package cn.bingoogolapple.bgarefreshlayoutdemo.engine;

import java.util.List;

import cn.bingoogolapple.bgarefreshlayoutdemo.model.RefreshModel;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:15/9/17 下午2:01
 * 描述:
 */
public interface Engine {

    @GET("refreshlayout/api/defaultdata.json")
    Call<List<RefreshModel>> loadInitDatas();

    @GET("refreshlayout/api/newdata{pageNumber}.json")
    Call<List<RefreshModel>> loadNewData(@Path("pageNumber") int pageNumber);

    @GET("refreshlayout/api/moredata{pageNumber}.json")
    Call<List<RefreshModel>> loadMoreData(@Path("pageNumber") int pageNumber);

}
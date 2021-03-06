package com.linxiao.quickdevframework.main;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.linxiao.framework.list.BaseRecyclerViewAdapter;
import com.linxiao.framework.list.BaseRecyclerViewHolder;
import com.linxiao.quickdevframework.R;

/**
 *
 * Created by linxiao on 2016/11/30.
 */
public class ApiSampleListAdapter extends BaseRecyclerViewAdapter<ApiSampleObject, ApiSampleListAdapter.ApiSampleHolder> {

    public ApiSampleListAdapter(Context context) {
        super(context);
    }

    @Override
    protected void setData(ApiSampleHolder holder, int position, ApiSampleObject data) {
        holder.textView.setText(data.getApiName());
    }

    @Override
    protected ApiSampleHolder onCreateDataViewHolder(ViewGroup parent, int viewType) {
        return new ApiSampleHolder(inflateItemView(R.layout.item_api_sample, parent));
    }

    class ApiSampleHolder extends BaseRecyclerViewHolder {

        TextView textView;

        public ApiSampleHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.tvApiSample);
        }

    }
}

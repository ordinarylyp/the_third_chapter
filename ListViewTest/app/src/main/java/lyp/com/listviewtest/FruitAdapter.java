package lyp.com.listviewtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lyp on 2018/4/25.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;
    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit=getItem(position);//传递实例
 //       View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        View view;
        ViewHolder viewHolder;
        if(convertView==null){ //如果convertView为空再使用LayoutInflater重新加载布局
            view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.fruitImage=view.findViewById(R.id.fruit_image);
            viewHolder.fruitName=view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);//将viewHolder存储在View中
        }
        else {
            view=convertView;
            viewHolder=(ViewHolder) view.getTag();//重新 获取ViewHolder
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());
/*        ImageView fruitImage =view.findViewById(R.id.fruit_image);
        TextView fruitName = view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageId());     使用findViewById方法获取控件实例造成资源浪费
        fruitName.setText(fruit.getName());*/
        return view;
    }
    class ViewHolder{ //将控件实例存储在ViewHolder中，避免每次都要调用findViewById方法
        ImageView fruitImage;
        TextView fruitName;
    }
}

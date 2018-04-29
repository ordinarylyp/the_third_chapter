package lyp.com.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    private String[] data={"Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry",
//            "Cherry","Mango","Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry",
//            "Cherry","Mango"};
    private List<Fruit> fruitList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();

//        ArrayAdapter<String> adapter =new ArrayAdapter<String>(MainActivity.this,
//                android.R.layout.simple_list_item_1,data);//使用泛型 适配器，中间的参数表示ListView的子项布局id
/*
           在Activity中写的数据（数组、链表、集合、数据库等）无法直接传递给ListView的，要将数据传递过去，
           需要借助适配器(Adapter)来完成。
           ArrayAdapter这个适配器（数组适配器），这个适配器的数据源可以是集合或者数组
           ArrayAdapter的构造方法：
         public ArrayAdapter (Context context, int resource, List objects)
        其中 resource 是 layout，list object 是要适配的数据。


        最后，还需要调用 ListView 的 setAdapter() 方法，将构建好的适配器对象传递进去，才算将 ListView 和数据关联好。

 */
        FruitAdapter adapter=new FruitAdapter(this,R.layout.fruit_item,fruitList);
        ListView listView=findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit=fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initFruits(){
        for(int i=0;i<2;i++){
            Fruit apple=new Fruit("Apple",R.drawable.apple);
            fruitList.add(apple);
            Fruit banana=new Fruit("Banana",R.drawable.banana);
            fruitList.add(banana);
            Fruit orange=new Fruit("Orange",R.drawable.orange);
            fruitList.add(orange);
            Fruit watermelon=new Fruit("Watermelon",R.drawable.watermelon);
            fruitList.add(watermelon);
            Fruit pear=new Fruit("Pear",R.drawable.pear);
            fruitList.add(pear);
            Fruit grape=new Fruit("Grape",R.drawable.grape);
            fruitList.add(grape);
            Fruit pineapple=new Fruit("Pineapple",R.drawable.pineapple);
            fruitList.add(pineapple);
            Fruit strawberry=new Fruit("Strawberry",R.drawable.strawberry);
            fruitList.add(strawberry);
            Fruit cherry=new Fruit("Cherry",R.drawable.cherry);
            fruitList.add(cherry);
            Fruit mango=new Fruit("Mango",R.drawable.mango);
            fruitList.add(mango);
        }
    }
}

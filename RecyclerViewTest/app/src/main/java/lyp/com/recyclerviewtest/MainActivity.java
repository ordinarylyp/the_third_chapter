package lyp.com.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
//        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
 //   StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3,
   //            StaggeredGridLayoutManager.VERTICAL); //瀑布流布局，将布局分为3列
        GridLayoutManager layoutManager = new GridLayoutManager(getBaseContext(),2);//网格式布局
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter=new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }
    private void initFruits(){
        for(int i=0;i<2;i++){
            Fruit apple=new Fruit(
                    getRandomLengthName("Apple"),R.drawable.apple);
            fruitList.add(apple);
            Fruit banana=new Fruit(
                    getRandomLengthName("Banana"),R.drawable.banana);
            fruitList.add(banana);
            Fruit orange=new Fruit(
                    getRandomLengthName("Orange"),R.drawable.orange);
            fruitList.add(orange);
            Fruit watermelon=new Fruit(
                    getRandomLengthName("Watermelon"),R.drawable.watermelon);
            fruitList.add(watermelon);
            Fruit pear=new Fruit(
                    getRandomLengthName("Pear"),R.drawable.pear);
            fruitList.add(pear);
            Fruit grape=new Fruit(
                    getRandomLengthName("Grape"),R.drawable.grape);
            fruitList.add(grape);
            Fruit pineapple=new Fruit(
                    getRandomLengthName("Pineapple"),R.drawable.pineapple);
            fruitList.add(pineapple);
            Fruit strawberry=new Fruit(
                    getRandomLengthName("Strawberry"),R.drawable.strawberry);
            fruitList.add(strawberry);
            Fruit cherry=new Fruit(
                    getRandomLengthName("Cherry"),R.drawable.cherry);
            fruitList.add(cherry);
            Fruit mango=new Fruit(
                    getRandomLengthName("Mango"),R.drawable.mango);
            fruitList.add(mango);
        }
    }

    private String getRandomLengthName(String name) {
        Random random=new Random();
        int length =random.nextInt(20)+1;
        StringBuilder builder =new StringBuilder();
        for (int i=0;i<length;i++){
            builder.append(name);
        }
        return builder.toString();
    }
}

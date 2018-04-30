# the_third_chapter
这是第一行代码中的第三章，最主要是Android UI界面的开发
下面分各个项目来讲学习的过程
### UIWidgetTest
这个项目主要讲的是一些Android中常用的控件
包括 TextView，Button，EditText，ImageView，ProgressBar
[点击这里查看](/UIWidgetTest/app/src/main/res/layout/activity_main.xml)
还讲了一些弹出的两种对话框(AlertDialog和ProgressDialog）
[点击查看](/UIWidgetTest/app/src/main/java/lyp/com/uiwidgettest/MainActivity.java)
注意AlterDialog中的setPositiveButton和setNegativeButton方法
### UILaoutTest
这个项目讲的是关于Android的四种布局方式
其中线性布局（LinearLayout）和相对布局（RelativeLayout）是使用比较普遍的两个布局方式。LinearLayout主要是分为垂直（vertical）和水平（horizontal）两种方式的布局，而RelativeLayout主要是先对整个布局或者是摸个确认的组件进行布局。
此外还有帧布局（FrameLayout）和百分比布局（PercentFrameLayout）。帧布局使用的范围较小；而在使用百分比布局时，需要在app/build.gradle文件中加入
“ implementation 'com.android.support:percent:26.1.0'”的语句。[点击查看百分比布局](/UILayoutTest/app/src/main/res/layout/activity_main.xml)
### UICustomView
这个项目讲的最主要的是自定义控件，通过定义一个[title.xml](/UICustomViews/app/src/main/res/layout/title.xml),将其引入到activity_mian.xml中，再将系统自带的标题栏隐藏掉，从而创建一个类似iphone标题栏的效果
### ListViewText
这个项目主要讲的就是Android中最常用的一个控件ListView，在有大量数据需要展示时就需要用到，是最常用的控件之一，也是需要掌握的重点和难点。

要想使用ListView首先就要现在[activity_main.xml](/ListViewTest/app/src/main/res/layout/activity_main.xml)中定义ListView组件。
 需要注意的是数据是无法直接传递给ListView的，需要使用适配器（Adapter）来完成，其中最常用的就是ArrayAdapter，它可以通过泛型来指定适配的数据类型，具体如何使用可以查看代码中的[注释](/ListViewTest/app/src/main/java/lyp/com/listviewtest/MainActivity.java)

但是仅仅简单的定义一个ListView是不够的，这样只是显示一段简单的内容，这在实际的应用中显然是不可能的。这里建立一个水果的列表，需要显示水果的图片和名称，我们先定义一个[Fruit](/ListViewTest/app/src/main/java/lyp/com/listviewtest/Fruit.java)类；然后再定义一个新的布局[fruit_item.xml](/ListViewTest/app/src/main/res/layout/fruit_item.xml)；由于要传入包括图片和文字在内的数据，原来的适配器显然是不能用的，所以这里需要一个自定义的适配器，于是我们新建类[FruitAdapter](/ListViewTest/app/src/main/java/lyp/com/listviewtest/FruitAdapter.java)继承自ArrayAdapter类。最后我们在[MainActivity](/ListViewTest/app/src/main/java/lyp/com/listviewtest/MainActivity.java)中使用自定义的适配器将数据传入，最终的运行结果如下：
![01.png](/img/ListViewTest.png "01")

ListView是有很多细节可以优化的，其中运行效率就是很重要的一点，因为会重复加载布局和获取控件实例，我们可以用判断convertView是否为空来避免重复加载布局，同时定义ViewHolder类来存储控件的实例对象，来避免重复获取控件实例，从而达到优化ListView的运行效率，具体如何实现可以直接查看[代码实例](/ListViewTest/app/src/main/java/lyp/com/listviewtest/FruitAdapter.java)。
### RecyclerViewTest
RecyclerView是比ListView更加强大的滚动控件，使用这个控件的时候需要在app/build.gradle文件中加入“implementation 'com.android.support:recyclerview-v7:26.1.0'”,最后定义在[activity_main.xml](/RecyclerViewTest/app/src/main/res/layout/activity_main.xml)中定义RecyclerView控件

同样定义[fruit_item.xml](/RecyclerViewTest/app/src/main/res/layout/fruit_item.xml)布局和Fruit类以及自定义适配器[FruitAdapter](/RecyclerViewTest/app/src/main/java/lyp/com/recyclerviewtest/FruitAdapter.java),和ListView不同，这次的适配器继承自RecyclerView.Adapter，并将泛型指定为FruitAdapter.ViewHolder,其中ViewHolder是在FruitAdapter中定义的内部类。

RecyclerView比ListView强大的地方就在于RecyclerView是可以定义横向滚动效果的，只要在布局文件中设置“android:orientation="vertical"”,以及在[MainActivity](/RecyclerViewTest/app/src/main/java/lyp/com/listviewtest/MainActivity.java)中设置layoutManger（RecyclerView的布局方式）即可。

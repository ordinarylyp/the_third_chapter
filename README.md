# the_third_chapter
这是第一行代码中的第三章，最主要是Android UI界面的开发
下面分各个项目来讲学习的过程
### UIWidgetTest
这个项目主要讲的是一些Android中常用的控件
包括 TextView，Button，EditText，ImageView，ProgressBar
[点击这里查看](https://github.com/ordinarylyp/the_third_chapter/blob/master/UIWidgetTest/app/src/main/res/layout/activity_main.xml)
还讲了一些弹出的两种对话框(AlertDialog和ProgressDialog）
[点击查看](https://github.com/ordinarylyp/the_third_chapter/blob/master/UIWidgetTest/app/src/main/java/lyp/com/uiwidgettest/MainActivity.java)
注意AlterDialog中的setPositiveButton和setNegativeButton方法
### UILaoutTest
这个项目讲的是关于Android的四种布局方式
其中线性布局（LinearLayout）和相对布局（RelativeLayout）是使用比较普遍的两个布局方式。LinearLayout主要是分为垂直（vertical）和水平（horizontal）两种方式的布局，而RelativeLayout主要是先对整个布局或者是摸个确认的组件进行布局。
此外还有帧布局（FrameLayout）和百分比布局（PercentFrameLayout）。帧布局使用的范围较小；而在使用百分比布局时，需要在app/build.gradle文件中加入
“ implementation 'com.android.support:percent:26.1.0'”的语句。[点击查看百分比布局](https://github.com/ordinarylyp/the_third_chapter/blob/master/UILayoutTest/app/src/main/res/layout/activity_main.xml)
### UICustomView
这个项目讲的最主要的是自定义控件，通过定义一个[title.xml](https://github.com/ordinarylyp/the_third_chapter/blob/master/UICustomViews/app/src/main/res/layout/title.xml),将其引入到activity_mian.xml中，再将系统自带的标题栏隐藏掉，从而创建一个类似iphone标题栏的效果
### ListViewText
这个项目主要讲的就是Android中最常用的一个控件ListView，在有大量数据需要展示时就需要用到，是最常用的控件之一，也是需要掌握的重点和难点。

要想使用ListView首先就要现在[activity_main.xml](https://github.com/ordinarylyp/the_third_chapter/blob/master/ListViewTest/app/src/main/res/layout/activity_main.xml)中定义ListView组件。
 需要注意的是数据是无法直接传递给ListView的，需要使用适配器（Adapter）来完成，其中最常用的就是ArrayAdapter，它可以通过泛型来指定适配的数据类型，具体如何使用可以查看代码中的[注释](https://github.com/ordinarylyp/the_third_chapter/blob/master/ListViewTest/app/src/main/java/lyp/com/listviewtest/MainActivity.java)

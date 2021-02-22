package com.example.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<News> newsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initNews(); //添加新闻数据

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        final NewsAdapter adapter = new NewsAdapter(newsList);
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new NewsAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                News news = newsList.get(position);
                Bitmap bitmap= BitmapFactory.decodeResource(getResources(),news.getImageId());
                Intent intent = new Intent(MainActivity.this, News1.class);
                intent.putExtra("name",news.getName());
                intent.putExtra("time",news.getTimeA());
                intent.putExtra("from",news.getFrom());
                intent.putExtra("bitmap",bitmap);
                intent.putExtra("text",news.getText());
                startActivity(intent);
            }
        });
    }
    private void initNews() {
        String text = "我只是一个新闻模版。既然可以传递数据给下一个活动，那么能不能够返回数据给上一个活动呢？答案是肯定的。不" +
                "过不同的是，返回上一个活动只需要按一下Back键就可以了，并没有一个用于启动活动的Intent" +
                "来传递数据。通过查阅文档你会发现，Activity中还有一个startActivityForResult() 方" +
                "法也是用于启动活动的，但这个方法期望在活动销毁的时候能够返回一个结果给上一个活动。" +
                "毫无疑问，这就是我们所需要的。当一个活动不再处于栈顶位置，但仍然可见时，这时活动就进入了暂停状态。你可能会觉" +
                "得既然活动已经不在栈顶了，还怎么会可见呢？这是因为并不是每一个活动都会占满整个" +
                "屏幕的，比如对话框形式的活动只会占用屏幕中间的部分区域，你很快就会在后面看到这" +
                "种活动。处于暂停状态的活动仍然是完全存活着的，系统也不愿意去回收这种活动（因为" +
                "它还是可见的，回收可见的东西都会在用户体验方面有不好的影响），只有在内存极低的" +
                "情况下，系统才会去考虑回收这种活动。";
        News news1 = new News("因补偿员工丰富 员工抢着被裁员？滴滴：不予回复","发布时间：11:20", R.mipmap.dada,"发布网站：人民日报", text);
        newsList.add(news1);
        News news2 = new News("特朗普：美国要领先 要靠竞争不靠封杀","发布时间：14:50", R.mipmap.trump,"发布网站：凤凰网", text);
        newsList.add(news2);
        News news3 = new News("任正非：感谢美国政府替华为宣传 Mate X","发布时间：13:40", R.mipmap.ren,"发布网站：头条营销号", text);
        newsList.add(news3);
        News news4 = new News("百度第四季度营收超272亿美元 同比增长22%","发布时间：12:30", R.mipmap.baidu,"发布网站：百度营销号", text);
        newsList.add(news4);
        News news5 = new News("特朗普新推：我只想上个头条","发布时间：17:08", R.mipmap.trump,"发布网站：微博初级营销号", text);
        newsList.add(news5);
        News news6 = new News("特朗普新推：我又想上个头条","发布时间：17:09", R.mipmap.trump,"发布网站：微博中级营销号", text);
        newsList.add(news6);
        News news7 = new News("特朗普新推：我还想上个头条","发布时间：17:10", R.mipmap.trump,"发布网站：微博高级营销号", text);
        newsList.add(news7);
        News news8 = new News("特朗普新推：上头条真爽","发布时间：17:11", R.mipmap.trump,"发布网站：微博王者营销号", text);
        newsList.add(news8);
    }
}
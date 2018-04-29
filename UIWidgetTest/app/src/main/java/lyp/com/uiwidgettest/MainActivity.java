package lyp.com.uiwidgettest;

        import android.app.ProgressDialog;
        import android.content.DialogInterface;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.ProgressBar;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        editText= findViewById(R.id.edit_text);
        imageView = findViewById(R.id.image_view);
        progressBar =findViewById(R.id.progress_bar);
        button.setOnClickListener(new View.OnClickListener() {//使用匿名类的方法注册监听器
            @Override
            public void onClick(View v) {
//                String inputText =editText.getText().toString();
//                Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();
               // imageView.setImageResource(R.drawable.img_2);
/*                if(progressBar.getVisibility()==View.GONE){
                    progressBar.setVisibility(View.VISIBLE);  显示变为不显示
                }
                else {
                    progressBar.setVisibility(View.GONE);     不显示变为显示
                }*/
//                int progress =progressBar.getProgress();
//                progress =progress+10;
//                progressBar.setProgress(progress);
 /*               AlertDialog.Builder dialog =new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("Something important");
                dialog.setCancelable(false);//屏蔽其他控件的交互能力
                dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();*/
                ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("this is ProgressDialog");
                progressDialog.setMessage("Loading...");
                progressDialog.setCancelable(true);
                progressDialog.show();
            }
        });
    }
}

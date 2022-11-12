package com.chaquotestversion;

import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import com.chaquo.python.PyObject;
        import com.chaquo.python.Python;
        import com.chaquo.python.android.AndroidPlatform;

public class MainPage extends AppCompatActivity {

    TextView textView;
    Button test_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        textView = (TextView) findViewById(R.id.text_view_python);
        test_button = (Button) findViewById(R.id.test_button);
        test_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calculate();
            }
        });


        if (!Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }
        //This will start python
    }
    public void Calculate() {
        Python py = Python.getInstance();

        PyObject pyobj = py.getModule("myscript");

        PyObject obj = pyobj.callAttr("main");

        textView.setText(obj.toString());
    }
}
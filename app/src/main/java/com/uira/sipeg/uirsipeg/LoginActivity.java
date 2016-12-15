package com.uira.sipeg.uirsipeg;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.renderscript.Type;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.uira.sipeg.uirsipeg.anim.GradientBackgroundPainter;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity{

    private GradientBackgroundPainter backgroundPainter;
    @BindView(R.id.username) EditText username;
    @BindView(R.id.password) EditText password;
    @BindView(R.id.login) Button login;
    private ProgressDialog pDialog;


    @OnClick(R.id.login) void login(){
        cekLogin();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        initVar();
        setHeader();
        setBackgroundPainter();

    }


    private void initVar() {
        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Loading . . . ");
        pDialog.setCancelable(true);
    }

    private void setHeader(){
        TextView judul = (TextView) findViewById(R.id.txt_judul);
        Typeface fontJdul = Typeface.createFromAsset(getAssets(), "fonts/RemachineScript_Personal_Use.ttf");
        judul.setTypeface(fontJdul);
    }


    private void bbb(){

    }

    private void setBackgroundPainter(){
        View backgroundImage = findViewById(R.id.background);

        final int[] drawables = new int[4];
        drawables[0] = R.drawable.gradient_1;
        drawables[1] = R.drawable.gradient_2;
        drawables[2] = R.drawable.gradient_3;
        drawables[3] = R.drawable.gradient_4;

        backgroundPainter = new GradientBackgroundPainter(backgroundImage, drawables);
        backgroundPainter.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        backgroundPainter.stop();
    }

    private void cekLogin() {

        if (!TextUtils.isEmpty(username.getText().toString()) && !TextUtils.isEmpty(password.getText().toString())){
            String u = username.getText().toString();
            String p = password.getText().toString();
            reqLogin(u,p);
        }else {
            Snackbar.make(login, "Username dan password tidak boleh ksosng", Snackbar.LENGTH_SHORT).show();
        }
    }

    private void reqLogin( String u, String p) {
        finish();
        //showDialog();
    }

    private void showDialog(){
        if (!pDialog.isShowing())
            pDialog.show();
    }

    private void hideDialog(){
        if (pDialog.isShowing())
            pDialog.dismiss();
    }
}

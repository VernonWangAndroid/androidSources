package com.bn.game.chap11.ex13;

import android.app.Activity;
import android.os.Bundle;
public class MyGLActivity extends Activity {
	MyGLView myGLView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        
        myGLView=new MyGLView(this);//创建myGLView
        this.setContentView(myGLView);//在LinearLayout中加入myGLView
    }
    @Override
    protected void onResume() {
        super.onResume();
        myGLView.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
        myGLView.onPause();
    }
}
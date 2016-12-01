package com.example.guohc.ec602_hw2;

/**
 * Created by bu on 10/27/16.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class ForwardTarget extends Activity{
    String str="";
    double result=0, num1=0, num2=0;
    int sign=0, flag=0;
    View vi;
    EditText et_show;
    Button but_0,but_1,but_2,but_3,but_4,but_5,but_6,but_7;
    Button but_8,but_9,but_add,but_sub,but_mlt,but_div,but_spot;
    Button but_sin,but_cos,but_tan,but_cot,but_equal,but_sqrt,but_square;
    Button clears,clearAll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leah1);
        et_show=(EditText)findViewById(R.id.et_show);
        et_show.setKeyListener(null);
        but_0=(Button)findViewById(R.id.btn_0);
        but_1=(Button)findViewById(R.id.btn_1);
        but_2=(Button)findViewById(R.id.btn_2);
        but_3=(Button)findViewById(R.id.btn_3);
        but_4=(Button)findViewById(R.id.btn_4);
        but_5=(Button)findViewById(R.id.btn_5);
        but_6=(Button)findViewById(R.id.btn_6);
        but_7=(Button)findViewById(R.id.btn_7);
        but_8=(Button)findViewById(R.id.btn_8);
        but_9=(Button)findViewById(R.id.btn_9);
        but_add=(Button)findViewById(R.id.btn_add);//º”∫≈..
        but_sub=(Button)findViewById(R.id.btn_sub);//ºı∫≈..
        but_mlt=(Button)findViewById(R.id.btn_mlt);//≥À∫≈..
        but_div=(Button)findViewById(R.id.btn_div);//≥˝∫≈..
        but_spot=(Button)findViewById(R.id.btn_spot);//µ„..
        but_equal=(Button)findViewById(R.id.btn_equal);//µ»”⁄..
        but_sin=(Button)findViewById(R.id.btn_sin);//sin..
        but_cos=(Button)findViewById(R.id.btn_cos);//cos..
        but_tan=(Button)findViewById(R.id.btn_tan);//tan..
        but_cot=(Button)findViewById(R.id.btn_cot);//cot..
        but_square=(Button)findViewById(R.id.btn_square);//∆Ω∑Ω..
        but_sqrt=(Button)findViewById(R.id.btn_sqrt);//∏˘∫≈..
        clears=(Button)findViewById(R.id.clears);//«Â≥˝..
        clearAll=(Button)findViewById(R.id.clearAll);//»´«Â..
        but_0.setOnClickListener(new onclicklistener());
        but_1.setOnClickListener(new onclicklistener());
        but_2.setOnClickListener(new onclicklistener());
        but_3.setOnClickListener(new onclicklistener());
        but_4.setOnClickListener(new onclicklistener());
        but_5.setOnClickListener(new onclicklistener());
        but_6.setOnClickListener(new onclicklistener());
        but_7.setOnClickListener(new onclicklistener());
        but_8.setOnClickListener(new onclicklistener());
        but_9.setOnClickListener(new onclicklistener());
        but_add.setOnClickListener(new onclicklistener());
        but_sub.setOnClickListener(new onclicklistener());
        but_mlt.setOnClickListener(new onclicklistener());
        but_div.setOnClickListener(new onclicklistener());
        but_spot.setOnClickListener(new onclicklistener());
        but_sin.setOnClickListener(new onclicklistener());
        but_cos.setOnClickListener(new onclicklistener());
        but_tan.setOnClickListener(new onclicklistener());
        but_cot.setOnClickListener(new onclicklistener());
        but_equal.setOnClickListener(new onclicklistener());
        but_sqrt.setOnClickListener(new onclicklistener());
        but_square.setOnClickListener(new onclicklistener());
        clears.setOnClickListener(new onclicklistener());
        clearAll.setOnClickListener(new onclicklistener());
	   /* π”√◊¢Ω‚¿¥∞Û∂® ¬º˛..
		 * */
    }

    public double calculater(){
        switch(sign){
            case 0:
                result=num2;                  //res=3;
                break;
            case 1:
                result=num1+num2;
                break;
            case 2:
                result=num1-num2;
                break;
            case 3:
                result=num1*num2;
                break;
            case 4:
                result=num1/num2;
                break;
        }
        num1=result;     //num1=3;
        sign=0;
        return result;
    }
    class onclicklistener implements OnClickListener{
        public void onClick(View v){
            switch(v.getId()){
                case R.id.btn_0:
                {
                    if(flag==1){
                        str="";
                        str+=0;
                        et_show.setText(str);
                        flag=0;
                    }else{
                        char ch1[];
                        ch1=str.toCharArray();
                        if(!(ch1.length==1 && ch1[0]=='0')){
                            str+=0;
                            et_show.setText(str);
                        }
                    }
                    vi=v;
                    break;
                }
                case R.id.btn_1:{
                    if(flag==1){
                        str="";
                        str+=1;
                        et_show.setText(str);
                        flag=0;
                    }else{
                        str+=1;
                        et_show.setText(str);
                    }
                    vi=v;
                    break;
                }
                case R.id.btn_2:{
                    if(flag==1){
                        str="";
                        str+=2;
                        et_show.setText(str);
                        flag=0;
                    }else{
                        str+=2;
                        et_show.setText(str);
                    }
                    vi=v;
                    break;
                }
                case R.id.btn_3:{
                    if(flag==1){
                        str="";
                        str+=3;
                        et_show.setText(str);
                        flag=0;
                    }else{
                        str+=3;
                        et_show.setText(str);
                    }
                    vi=v;
                    break;
                }
                case R.id.btn_4:{
                    if(flag==1){
                        str="";
                        str+=4;
                        et_show.setText(str);
                        flag=0;
                    }else{
                        str+=4;
                        et_show.setText(str);
                    }
                    vi=v;
                    break;
                }
                case R.id.btn_5:{
                    if(flag==1){
                        str="";
                        str+=5;
                        et_show.setText(str);
                        flag=0;
                    }else{
                        str+=5;
                        et_show.setText(str);
                    }
                    vi=v;
                    break;
                }
                case R.id.btn_6:{
                    if(flag==1){
                        str="";
                        str+=6;
                        et_show.setText(str);
                        flag=0;
                    }else{
                        str+=6;
                        et_show.setText(str);
                    }
                    vi=v;
                    break;
                }
                case R.id.btn_7:{
                    if(flag==1){
                        str="";
                        str+=7;
                        et_show.setText(str);
                        flag=0;
                    }else{
                        str+=7;
                        et_show.setText(str);
                    }
                    vi=v;
                    break;
                }
                case R.id.btn_8:{
                    if(flag==1){
                        str="";
                        str+=8;
                        et_show.setText(str);
                        flag=0;
                    }else{
                        str+=8;
                        et_show.setText(str);
                    }
                    vi=v;
                    break;
                }
                case R.id.btn_9:{
                    if(flag==1){
                        str="";
                        str+=9;
                        et_show.setText(str);
                        flag=0;
                    }else{
                        str+=9;
                        et_show.setText(str);
                    }
                    vi=v;
                    break;
                }
                case R.id.btn_add:{
                    if(str!=""){
                        if(vi==but_add){
                            sign=1;
                        }else{
                            num2=Double.parseDouble(str);  //num2=3;
                            calculater();
                            str=""+result;
                            et_show.setText(str);
                            sign=1;
                            flag=1;
                            vi=v;
                        }

                    }
                    break;
                }
                case R.id.btn_sub:{
                    if(str!=""){
                        if(vi==but_sub){
                            sign=2;
                        }else{
                            num2=Double.parseDouble(str);
                            calculater();
                            str=""+result;
                            et_show.setText(str);
                            sign=2;
                            flag=1;
                            vi=v;
                        }
                    }
                    break;
                }
                case R.id.btn_mlt:{
                    if(str!=""){
                        if(vi==but_mlt){
                            sign=3;
                        }else{
                            num2=Double.parseDouble(str);
                            calculater();
                            str=""+result;
                            et_show.setText(str);
                            flag=1;
                            sign=3;
                            vi=v;
                        }
                    }
                    break;
                }
                case R.id.btn_div:{
                    if(str!=""){
                        if(vi==but_div){
                            sign=4;
                        }else{
                            num2=Double.parseDouble(str);
                            calculater();
                            str=""+result;
                            et_show.setText(str);
                            flag=1;
                            sign=4;
                            vi=v;
                        }
                    }
                    break;
                }
                case R.id.btn_spot:{
                    str=str+".";
                    et_show.setText(str);
                    break;
                }
                case R.id.btn_equal:{
                    if(str!=""&&vi!=but_add&&vi!=but_sub&&vi!=but_mlt&&vi!=but_div){
                        num2=Double.parseDouble(str);
                        calculater();
                        str=""+result;
                        et_show.setText(str);
                        flag=1;
                        vi=v;
                    }
                    break;
                }
                case R.id.btn_sqrt:{
                    if(str!=""){
                        num2=Double.parseDouble(str);
                        result=Math.sqrt(num2);
                        str=""+result;
                        et_show.setText(str);
                    }
                    break;
                }
                case R.id.btn_square:{
                    if(str!=""){
                        num2=Double.parseDouble(str);
                        result=num2*num2;
                        str=""+result;
                        et_show.setText(str);
                    }
                    break;
                }
                case R.id.btn_sin:{
                    if(str!=""){
                        num2=Double.parseDouble(str);
                        result=Math.sin(num2);
                        str=""+result;
                        et_show.setText(str);
                    }
                    break;
                }
                case R.id.btn_cos:{
                    if(str!=""){
                        num2=Double.parseDouble(str);
                        result=Math.cos(num2);
                        str=""+result;
                        et_show.setText(str);
                    }
                    break;
                }
                case R.id.btn_tan:{
                    if(str!=""){
                        num2=Double.parseDouble(str);
                        result=Math.tan(num2);
                        str=""+result;
                        et_show.setText(str);
                    }
                    break;
                }
                case R.id.btn_cot:{
                    if(str!=""){
                        num2=Double.parseDouble(str);
                        result=(1/Math.tan(num2));
                        str=""+result;
                        et_show.setText(str);
                    }
                    break;
                }
                case R.id.clears:{
                    str="";
                    et_show.setText(str);
                    vi=v;
                    break;
                }
                case R.id.clearAll:{
                    num1=0.0;num2=0;result=0.0;
                    str="";
                    et_show.setText(str);
                }
            }
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        menu.add(0, 1, 1, "ÕÀ≥ˆ");
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == 1) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}

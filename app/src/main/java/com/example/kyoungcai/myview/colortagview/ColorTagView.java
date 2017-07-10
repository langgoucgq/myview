package com.example.kyoungcai.myview.colortagview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.kyoungcai.myview.R;

/**
 * Created by KyoungCai on 2017/7/10.
 */

public class ColorTagView extends LinearLayout {

    private Context context;

    private float textSize;
    private int background;

    private int paddingLeftRight;

    private int paddingTopBottom;

    private int textColor;

    private TextView textView;

    public ColorTagView(Context context) {
        this(context,null);
    }

    public ColorTagView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context=context;

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.ColorTagView);
        if(typedArray!=null){

            for(int i=0;i<typedArray.length();i++){
                int attr=typedArray.getIndex(i);
                switch (attr){
                    case R.styleable.ColorTagView_textSize:
                        textSize= typedArray.getDimension(R.styleable.ColorTagView_textSize, 14);
                        break;

                    case R.styleable.ColorTagView_color_background:
                        background = typedArray.getResourceId(R.styleable.ColorTagView_color_background, R.drawable.one_selecter);
                        this.setBackgroundResource(background);
                        break;

                    case R.styleable.ColorTagView_paddingLeftRight:
                        paddingLeftRight= (int) typedArray.getDimension(R.styleable.ColorTagView_paddingLeftRight, 0);
                        break;
                    case R.styleable.ColorTagView_paddingTopBottom:
                        paddingTopBottom= (int) typedArray.getDimension(R.styleable.ColorTagView_paddingTopBottom,0);
                        break;
                    case R.styleable.ColorTagView_textColor:
                        textColor= typedArray.getColor(R.styleable.ColorTagView_textColor, Color.BLACK);
                        break;

                }
            }


        }

        init();
        typedArray.recycle();


    }

    public ColorTagView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ColorTagView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }



    private void init(){
        textView=new TextView(context);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX,textSize);
        textView.setPadding(paddingLeftRight,paddingTopBottom,paddingLeftRight,paddingTopBottom);
        textView.setTextColor(textColor);
        addView(textView);

    }



    public void setText(String text){
        textView.setText(text);
    }


}

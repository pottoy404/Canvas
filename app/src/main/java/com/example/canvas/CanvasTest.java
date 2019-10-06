package com.example.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CanvasTest extends View {

    public CanvasTest(Context context) {
        super(context);
    }

    public CanvasTest(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        //Circle
        /*float W = getWidth()/2 ;
        float H = getHeight() /2 ;
        */

        float W = getWidth() ;
        float H = getHeight() ;

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.parseColor("#006a4e"));
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(5);

        /*
        for (int i=0; i<10; i++)
        {
            canvas.drawCircle(W,H,100 +i+(100*i),paint);

        }*/

         /*   for (int i=0; i<H; i+=8) {

                canvas.drawLine(10, 5, W, i, paint);
            }
        */
       /*  Rect rect = new Rect();
         rect.top=10;
         rect.left=10;
         rect.bottom = 2000;
         rect.right=1000;

         canvas.drawRect(rect,paint);*/

       int flagWidht = 1200;
       int falgHeight = 1000;
       Rect rect = new Rect();
        rect.top=200;
        rect.left=200;
        rect.bottom = falgHeight;
        rect.right=flagWidht;


        int cx = (flagWidht +200) /2;
        int cy = (falgHeight +200) / 2;
        int r =200;

        Rect rect1 = new Rect();
        rect1.top = 150;
        rect1.left= 150;
        rect1.bottom=falgHeight+1000;
        rect1.right = 200;

        Paint paintC = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintC.setStyle(Paint.Style.FILL);
        paintC.setColor(Color.parseColor("#FF0000"));

        Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint1.setStyle(Paint.Style.FILL);
        paint1.setColor(Color.parseColor("#000000"));

        canvas.drawRect(rect1,paint1);
        canvas.drawRect(rect,paint);
        canvas.drawCircle(cx,cy,r,paintC);

        super.onDraw(canvas);
    }
}

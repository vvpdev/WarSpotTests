package com.hfad.tanktests.adapters;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {




    // детектор жестор
    GestureDetector gestureDetector;

    // анонимный класс из интефейса
    private ClickListener listener;


    // для слушателя
    public interface ClickListener {

        void onItemClick(View view, int position);
    }


    // конструктор
    public RecyclerItemClickListener(Context context, final RecyclerView recyclerView, ClickListener listener) {
        this.listener = listener;

        this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener(){



            // простое нажатие
            @Override
            public boolean onSingleTapUp(MotionEvent e) {

                return true;
            }
        });
    }




    @Override
    public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {

        View childView = rv.findChildViewUnder(e.getX(), e.getY());
        if (childView != null && listener != null && gestureDetector.onTouchEvent(e)) {
            listener.onItemClick(childView, rv.getChildAdapterPosition(childView));
            return true;
        }
        return false;
    }

    @Override
    public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }


}

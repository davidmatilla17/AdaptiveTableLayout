package com.cleveroad.library;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

public class ShadowHelper {
    @Nullable
    private View mRightShadow;

    @Nullable
    private View mLeftShadow;

    @Nullable
    private View mTopShadow;

    @Nullable
    private View mBottomShadow;

    @Nullable
    private View mColumnsHeadersShadow;

    @Nullable
    private View mRowsHeadersShadow;

    @NonNull
    public View addColumnsHeadersShadow(ViewGroup group) {
        if (mColumnsHeadersShadow == null) {
            mColumnsHeadersShadow = new View(group.getContext());
            mColumnsHeadersShadow.setBackgroundResource(R.drawable.shadow_bottom);
            group.addView(mColumnsHeadersShadow, 0);
        }
        return mColumnsHeadersShadow;
    }

    @Nullable
    public View getColumnsHeadersShadow() {
        return mColumnsHeadersShadow;
    }

    @NonNull
    public View addRowsHeadersShadow(ViewGroup group) {
        if (mRowsHeadersShadow == null) {
            mRowsHeadersShadow = new View(group.getContext());
            mRowsHeadersShadow.setBackgroundResource(R.drawable.shadow_right);
            group.addView(mRowsHeadersShadow, 0);
        }
        return mRowsHeadersShadow;
    }

    @Nullable
    public View getRowsHeadersShadow() {
        return mRowsHeadersShadow;
    }

    public void removeColumnsHeadersShadow(ViewGroup group) {
        if (mColumnsHeadersShadow != null) {
            group.removeView(mColumnsHeadersShadow);
            mColumnsHeadersShadow = null;
        }
    }

    public void removeRowsHeadersShadow(ViewGroup group) {
        if (mRowsHeadersShadow != null) {
            group.removeView(mRowsHeadersShadow);
            mRowsHeadersShadow = null;
        }
    }

    @NonNull
    public View addLeftShadow(ViewGroup group) {
        if (mLeftShadow == null) {
            mLeftShadow = new View(group.getContext());
            mLeftShadow.setBackgroundResource(R.drawable.shadow_left);
            group.addView(mLeftShadow, 0);
        }
        return mLeftShadow;
    }

    @Nullable
    public View getLeftShadow() {
        return mLeftShadow;
    }

    @NonNull
    public View addRightShadow(ViewGroup group) {
        if (mRightShadow == null) {
            mRightShadow = new View(group.getContext());
            mRightShadow.setBackgroundResource(R.drawable.shadow_right);
            group.addView(mRightShadow, 0);
        }
        return mRightShadow;
    }

    @Nullable
    public View getRightShadow() {
        return mRightShadow;
    }

    @NonNull
    public View addTopShadow(ViewGroup group) {
        if (mTopShadow == null) {
            mTopShadow = new View(group.getContext());
            mTopShadow.setBackgroundResource(R.drawable.shadow_top);
            group.addView(mTopShadow, 0);
        }
        return mTopShadow;
    }

    @Nullable
    public View getTopShadow() {
        return mTopShadow;
    }

    @NonNull
    public View addBottomShadow(ViewGroup group) {
        if (mBottomShadow == null) {
            mBottomShadow = new View(group.getContext());
            mBottomShadow.setBackgroundResource(R.drawable.shadow_bottom);
            group.addView(mBottomShadow, 0);
        }
        return mBottomShadow;
    }

    @Nullable
    public View getBottomShadow() {
        return mBottomShadow;
    }

    public void removeAllDragAndDropShadows(ViewGroup group) {
        if (mLeftShadow != null) {
            group.removeView(mLeftShadow);
            mLeftShadow = null;
        }

        if (mRightShadow != null) {
            group.removeView(mRightShadow);
            mRightShadow = null;
        }

        if (mTopShadow != null) {
            group.removeView(mTopShadow);
            mTopShadow = null;
        }

        if (mBottomShadow != null) {
            group.removeView(mBottomShadow);
            mBottomShadow = null;
        }
    }

}
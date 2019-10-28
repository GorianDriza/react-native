/**
* Copyright (c) Facebook, Inc. and its affiliates.
*
* This source code is licensed under the MIT license found in the
* LICENSE file in the root directory of this source tree.
*
* @generated by codegen project: GeneratePropsJavaDelegate.js
*/

package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.LayoutShadowNode;

public class AndroidProgressBarManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & AndroidProgressBarManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
  public AndroidProgressBarManagerDelegate(U viewManager) {
    super(viewManager);
  }
  @Override
  public void setProperty(T view, String propName, @Nullable Object value) {
    switch (propName) {
      case "styleAttr":
        mViewManager.setStyleAttr(view, value == null ? null : (String) value);
        break;
      case "typeAttr":
        mViewManager.setTypeAttr(view, value == null ? null : (String) value);
        break;
      case "indeterminate":
        mViewManager.setIndeterminate(view, value == null ? false : (boolean) value);
        break;
      case "progress":
        mViewManager.setProgress(view, value == null ? 0f : ((Double) value).doubleValue());
        break;
      case "animating":
        mViewManager.setAnimating(view, value == null ? true : (boolean) value);
        break;
      case "color":
        mViewManager.setColor(view, value == null ? null : ((Double) value).intValue());
        break;
      case "testID":
        mViewManager.setTestID(view, value == null ? "" : (String) value);
        break;
      default:
        super.setProperty(view, propName, value);
    }
  }
}
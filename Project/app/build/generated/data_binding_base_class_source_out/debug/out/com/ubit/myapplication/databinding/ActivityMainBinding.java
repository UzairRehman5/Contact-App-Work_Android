// Generated by view binder compiler. Do not edit!
package com.ubit.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ubit.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final ConstraintLayout coordinatorLayout;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final ContentMainBinding include;

  @NonNull
  public final Button pickContactButton;

  @NonNull
  public final Toolbar toolbar;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppBarLayout appBarLayout, @NonNull ConstraintLayout coordinatorLayout,
      @NonNull FloatingActionButton fab, @NonNull ContentMainBinding include,
      @NonNull Button pickContactButton, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.appBarLayout = appBarLayout;
    this.coordinatorLayout = coordinatorLayout;
    this.fab = fab;
    this.include = include;
    this.pickContactButton = pickContactButton;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBarLayout;
      AppBarLayout appBarLayout = ViewBindings.findChildViewById(rootView, id);
      if (appBarLayout == null) {
        break missingId;
      }

      ConstraintLayout coordinatorLayout = (ConstraintLayout) rootView;

      id = R.id.fab;
      FloatingActionButton fab = ViewBindings.findChildViewById(rootView, id);
      if (fab == null) {
        break missingId;
      }

      id = R.id.include;
      View include = ViewBindings.findChildViewById(rootView, id);
      if (include == null) {
        break missingId;
      }
      ContentMainBinding binding_include = ContentMainBinding.bind(include);

      id = R.id.pickContactButton;
      Button pickContactButton = ViewBindings.findChildViewById(rootView, id);
      if (pickContactButton == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, appBarLayout, coordinatorLayout,
          fab, binding_include, pickContactButton, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

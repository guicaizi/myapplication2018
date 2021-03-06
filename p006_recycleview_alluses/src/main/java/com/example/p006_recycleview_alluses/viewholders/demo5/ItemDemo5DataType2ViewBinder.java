/*
 * Copyright 2016 drakeet. https://github.com/drakeet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.p006_recycleview_alluses.viewholders.demo5;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.librecycleview.ItemViewBinder;
import com.example.p006_recycleview_alluses.R;
import com.example.p006_recycleview_alluses.models.demo5.ItemDemo5;


/**
 * Note: Data - ItemDemo5DataType2ViewBinder
 *
 * @author drakeet
 */
public class ItemDemo5DataType2ViewBinder extends ItemViewBinder<ItemDemo5, ItemDemo5DataType2ViewBinder.ViewHolder> {

  @Override
  protected @NonNull
  ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
    View root = inflater.inflate(R.layout.rec_demo5_item_data_type2, parent, false);
    return new ViewHolder(root);
  }

  @Override
  protected void onBindViewHolder(@NonNull ItemDemo5DataType2ViewBinder.ViewHolder holder, @NonNull ItemDemo5 data) {
    holder.setTitle(data.getContent1());
  }


  static class ViewHolder extends RecyclerView.ViewHolder {

    TextView titleView;


    ViewHolder(View itemView) {
      super(itemView);
      titleView = itemView.findViewById(R.id.tv1);
    }


    void setTitle(String title) {
      titleView.setText(title);
    }
  }
}
